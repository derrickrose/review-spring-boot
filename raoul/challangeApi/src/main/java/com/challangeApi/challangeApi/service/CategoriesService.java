package com.challangeApi.challangeApi.service;

import com.challangeApi.challangeApi.dto.CategoriesDto;
import com.challangeApi.challangeApi.rows.RowsCategories;

import java.util.List;

public interface CategoriesService {

    public List<RowsCategories> findAllCategories();
    public CategoriesDto findByCategoryId(int category_id);
    public List<RowsCategories> findByDepartmentId(int department_id);

}
