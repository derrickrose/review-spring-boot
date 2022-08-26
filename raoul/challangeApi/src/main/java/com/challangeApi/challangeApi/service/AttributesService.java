package com.challangeApi.challangeApi.service;

import com.challangeApi.challangeApi.dto.AttributesDto;
import com.challangeApi.challangeApi.model.Attributes;

import java.util.List;

public interface AttributesService {

    public List<AttributesDto> findAllAttributes();
    public AttributesDto findByAttributesId(int attribute_id);
}
