package com.challangeApi.challangeApi.service;


import com.challangeApi.challangeApi.dto.DepartmentDto;
import com.challangeApi.challangeApi.model.Department;
import com.challangeApi.challangeApi.repository.DepartmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.el.ELException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImp implements DepartmentService{


    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<DepartmentDto> findAllDepartment() {
        List<Department> departments = departmentRepository.findAll();
        return departments.stream().map(department -> convertToDto(department)).collect(Collectors.toList());
    }

    @Override
    public DepartmentDto findByDepartmentId(int departmentId) {
        Department department = departmentRepository.findById(departmentId).orElseThrow(()-> new ELException("Department not found by id " + departmentId));
        return convertToDto(department);
    }

    public DepartmentDto convertToDto(Department department){
       return modelMapper.map(department, DepartmentDto.class);
    }

    public Department convertToEntity(DepartmentDto departmentDto){
        return modelMapper.map(departmentDto, Department.class);
    }
}
