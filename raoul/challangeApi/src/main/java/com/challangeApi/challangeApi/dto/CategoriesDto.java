package com.challangeApi.challangeApi.dto;

public class CategoriesDto {
    private int category_id;
    private String name;
    private String description;
    private int department_id;

    public CategoriesDto(){}
    public CategoriesDto(int category_id, String name, String description){
        this.category_id = category_id;
        this.name = name;
        this.description = description;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}
