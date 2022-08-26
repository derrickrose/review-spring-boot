package com.challangeApi.challangeApi.service;

import com.challangeApi.challangeApi.dto.SingleProductDto;
import com.challangeApi.challangeApi.paramettre.PaginationMeta;
import com.challangeApi.challangeApi.paramettre.ProductParameter;
import com.challangeApi.challangeApi.rows.RowsProduct;

import java.util.List;

public interface ProductService {
    //public List<RowsProduct> findAllProduct();
    public List<RowsProduct> findAllProduct(ProductParameter productParameter);
    public SingleProductDto findByProductId(int product_id);
}
