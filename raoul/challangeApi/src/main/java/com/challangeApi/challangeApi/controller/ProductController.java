package com.challangeApi.challangeApi.controller;

import com.challangeApi.challangeApi.dto.SingleProductDto;
import com.challangeApi.challangeApi.paramettre.PaginationMeta;
import com.challangeApi.challangeApi.paramettre.ProductParameter;
import com.challangeApi.challangeApi.paramettre.SingleProductParameter;
import com.challangeApi.challangeApi.rows.RowsProduct;
import com.challangeApi.challangeApi.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<RowsProduct>> findAllProduct(@RequestBody ProductParameter productParameter){
        return ResponseEntity.ok(productService.findAllProduct(productParameter));
    }

    @GetMapping("/{product_id}")
    public ResponseEntity<SingleProductDto> findByProductId(@PathVariable(name = "product_id") int product_id, @RequestBody SingleProductParameter parameter){
        return ResponseEntity.ok(productService.findByProductId(product_id));
    }
}
