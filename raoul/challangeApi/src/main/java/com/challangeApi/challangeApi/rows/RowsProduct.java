package com.challangeApi.challangeApi.rows;

import com.challangeApi.challangeApi.dto.ProductDto;
import com.challangeApi.challangeApi.paramettre.PaginationMeta;

import java.util.ArrayList;
import java.util.List;

public class RowsProduct {

    private PaginationMeta paginationMeta;

    private List<ProductDto> rows = new ArrayList<>();

    public List<ProductDto> getRows() {
        return rows;
    }

    public void setRows(List<ProductDto> rows) {
        this.rows = rows;
    }

    public PaginationMeta getPaginationMeta() {
        return paginationMeta;
    }

    public void setPaginationMeta(PaginationMeta paginationMeta) {
        this.paginationMeta = paginationMeta;
    }
}
