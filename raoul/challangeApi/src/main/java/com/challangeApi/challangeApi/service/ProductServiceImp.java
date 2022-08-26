package com.challangeApi.challangeApi.service;

import com.challangeApi.challangeApi.dto.ProductDto;
import com.challangeApi.challangeApi.dto.SingleProductDto;
import com.challangeApi.challangeApi.model.Product;
import com.challangeApi.challangeApi.paramettre.PaginationMeta;
import com.challangeApi.challangeApi.paramettre.ProductParameter;
import com.challangeApi.challangeApi.repository.ProductRepository;
import com.challangeApi.challangeApi.rows.RowsProduct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.el.ELException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    private ProductRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<RowsProduct> findAllProduct(ProductParameter productParameter) {

        int page = productParameter.getPage();
        int limit = productParameter.getLimit();

        Pageable pageable = PageRequest.of(page,limit);
        RowsProduct rowsProduct = new RowsProduct();
        List<RowsProduct> rowsProductList = new ArrayList<>();

        Page<Product> productPage = repository.findAll(pageable);

        List<Product> productList = productPage.getContent();
        int totalElement = (int) productPage.getTotalElements();

        List<ProductDto> productDtoList = productList.stream().map(product -> convertToDto(product)).collect(Collectors.toList());
        rowsProduct.setRows(productDtoList);

        PaginationMeta paginationMeta = new PaginationMeta();
        paginationMeta.setCurrentPage(page);
        paginationMeta.setCurrentPageSize(limit);
        paginationMeta.setTotalPages(productPage.getTotalPages());
        paginationMeta.setTotalRecords(totalElement);
        rowsProduct.setPaginationMeta(paginationMeta);
        rowsProductList.add(rowsProduct);
        return rowsProductList;
    }

    @Override
    public SingleProductDto findByProductId(int product_id) {
        Product product = repository.findById(product_id).orElseThrow(()-> new ELException("Product not found by id : " + product_id));

        return convertToDtoSingle(product);
    }

    public ProductDto convertToDto(Product product){
        return modelMapper.map(product, ProductDto.class);
    }

    public SingleProductDto convertToDtoSingle(Product product){
        return modelMapper.map(product, SingleProductDto.class);
    }

    public Product convertToEntity(ProductDto productDto){
        return modelMapper.map(productDto, Product.class);
    }
}
