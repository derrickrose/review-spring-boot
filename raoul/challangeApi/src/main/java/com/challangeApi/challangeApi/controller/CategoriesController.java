package com.challangeApi.challangeApi.controller;

import com.challangeApi.challangeApi.dto.CategoriesDto;
import com.challangeApi.challangeApi.model.Categories;
import com.challangeApi.challangeApi.rows.RowsCategories;
import com.challangeApi.challangeApi.service.CategoriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriesController {

    @Autowired
    private CategoriesService categoriesService;

    @GetMapping
    public ResponseEntity<List<RowsCategories>> findAllCategories(){
        return ResponseEntity.ok(categoriesService.findAllCategories());
    }

    @GetMapping("/{category_id}")
    public ResponseEntity<CategoriesDto> findByCatId(@PathVariable (name = "category_id") int category_id){
        return ResponseEntity.ok(categoriesService.findByCategoryId(category_id));
    }

    @GetMapping("/inDepartment/{department_id}")
    public ResponseEntity<List<RowsCategories>> findByDepId(@PathVariable (name = "department_id") int department_id){
        return ResponseEntity.ok(categoriesService.findByDepartmentId(department_id));
    }
}
