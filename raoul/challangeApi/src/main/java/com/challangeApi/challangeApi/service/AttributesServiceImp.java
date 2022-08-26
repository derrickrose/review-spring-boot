package com.challangeApi.challangeApi.service;

import com.challangeApi.challangeApi.dto.AttributesDto;
import com.challangeApi.challangeApi.model.Attributes;
import com.challangeApi.challangeApi.repository.AttributesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.el.ELException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AttributesServiceImp implements AttributesService{

    @Autowired
    private AttributesRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<AttributesDto> findAllAttributes() {

        List<Attributes> attributesList = repository.findAll();

        return attributesList.stream().map(attributes -> convertToDto(attributes)).collect(Collectors.toList());
    }

    @Override
    public AttributesDto findByAttributesId(int attribute_id) {
        Attributes attributes = repository.findById(attribute_id).orElseThrow(()->new ELException("Attribute not found by attribute_id " + attribute_id));
        return convertToDto(attributes);
    }

    public AttributesDto convertToDto(Attributes attributes){
        return modelMapper.map(attributes, AttributesDto.class);
    }

    public Attributes convertToEntity(AttributesDto attributesDto){
        return modelMapper.map(attributesDto, Attributes.class);
    }

}
