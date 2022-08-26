package com.challangeApi.challangeApi.controller;

import com.challangeApi.challangeApi.dto.DepartmentDto;
import com.challangeApi.challangeApi.model.Department;
import com.challangeApi.challangeApi.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public ResponseEntity<List<DepartmentDto>> findAllDepartment(){
        return ResponseEntity.ok(departmentService.findAllDepartment());
    }

    @GetMapping("/{departmentId}")
    public ResponseEntity<DepartmentDto> findByDepartmentId(@PathVariable(name = "departmentId") int departmentId){
        return ResponseEntity.ok(departmentService.findByDepartmentId(departmentId));
    }
}
