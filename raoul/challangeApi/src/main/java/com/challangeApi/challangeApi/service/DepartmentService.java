package com.challangeApi.challangeApi.service;



import com.challangeApi.challangeApi.dto.DepartmentDto;
import com.challangeApi.challangeApi.model.Department;

import java.util.List;

public interface DepartmentService {
    public List<DepartmentDto> findAllDepartment();
    public DepartmentDto findByDepartmentId(int departmentId);
}