package com.challangeApi.challangeApi.rows;

import com.challangeApi.challangeApi.dto.CategoriesDto;
import com.challangeApi.challangeApi.model.Categories;

import java.util.ArrayList;
import java.util.List;

public class RowsCategories {

    private List<CategoriesDto> rows = new ArrayList<>();

    public List<CategoriesDto> getRows() {
        return rows;
    }

    public void setRows(List<CategoriesDto> rows) {
        this.rows = rows;
    }
}