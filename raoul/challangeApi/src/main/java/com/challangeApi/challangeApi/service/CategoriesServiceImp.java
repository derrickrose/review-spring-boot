package com.challangeApi.challangeApi.service;

import com.challangeApi.challangeApi.dto.CategoriesDto;
import com.challangeApi.challangeApi.rows.RowsCategories;
import com.challangeApi.challangeApi.model.Categories;
import com.challangeApi.challangeApi.repository.CategoriesRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.el.ELException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoriesServiceImp implements CategoriesService {

    @Autowired
    private CategoriesRepository categoriesRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public CategoriesDto findByCategoryId(int category_id) {
        Categories categories = categoriesRepository.findById(category_id).orElseThrow(()-> new ELException("Category not found by id : " + category_id));
        return convertToDto(categories);
    }

    @Override
    public List<RowsCategories> findAllCategories() {
        List<RowsCategories> list = new ArrayList<>();
        RowsCategories rowsCategories = new RowsCategories();
        List<Categories> categoriesList = categoriesRepository.findAll();
        List<CategoriesDto> categoriesDtoList = categoriesList.stream().map(category -> convertToDto(category)).collect(Collectors.toList());
        rowsCategories.setRows(categoriesDtoList);
        list.add(rowsCategories);
        return list;
    }

    @Override
    public List<RowsCategories> findByDepartmentId(int department_id) {
        List<RowsCategories> list = new ArrayList<>();
        RowsCategories rowsCategories =new RowsCategories();
        List<Categories> categoriesList = categoriesRepository.getByDepartmentId(department_id);
        List<CategoriesDto> categoriesDtoList = categoriesList.stream().map(category -> convertToDto(category)).collect(Collectors.toList());
        rowsCategories.setRows(categoriesDtoList);
        list.add(rowsCategories);
        return list;
    }

    public CategoriesDto convertToDto(Categories categories){
        return modelMapper.map(categories,CategoriesDto.class);
    }

    public Categories convertToEntity(CategoriesDto categoriesDto){
        return modelMapper.map(categoriesDto, Categories.class);
    }
}
