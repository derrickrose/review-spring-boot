package com.challangeApi.challangeApi.repository;

import com.challangeApi.challangeApi.model.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoriesRepository extends JpaRepository<Categories, Integer> {

    @Query("select c from Categories c where c.department_id=?1")
    public List<Categories> getByDepartmentId(int department_id);
}
