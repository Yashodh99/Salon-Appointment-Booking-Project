package com.yashodh.service;

import com.yashodh.model.Category;
import com.yashodh.dto.SalonDTO;
import java.util.List;

public interface CategoryService {


    Category saveCategory(Category category, SalonDTO salonDTO);
    List<Category> getAllCategoriesBySalon(Long id);

    Category getCategoryById(Long id);

    void deleteCategoryById(Long id);

}
