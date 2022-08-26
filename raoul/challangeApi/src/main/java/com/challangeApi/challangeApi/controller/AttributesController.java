package com.challangeApi.challangeApi.controller;

import com.challangeApi.challangeApi.dto.AttributesDto;
import com.challangeApi.challangeApi.service.AttributesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(" /attributes")
public class AttributesController {

    @Autowired
    private AttributesService service;

    @GetMapping
    public ResponseEntity<List<AttributesDto>> findAllAttributes(){
        return ResponseEntity.ok(service.findAllAttributes());
    }

    @GetMapping("/{attribute_id}")
    public ResponseEntity<AttributesDto> findByAttributeId(@PathVariable(name = "attribute_id") int attribute_id){
        return ResponseEntity.ok(service.findByAttributesId(attribute_id));
    }

}
