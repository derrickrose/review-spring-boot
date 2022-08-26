package com.challangeApi.challangeApi.repository;

import com.challangeApi.challangeApi.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
