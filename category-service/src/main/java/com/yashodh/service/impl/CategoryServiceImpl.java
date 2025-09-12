package com.yashodh.service.impl;

import com.yashodh.dto.SalonDTO;
import com.yashodh.model.Category;
import com.yashodh.repository.CategoryRepository;
import com.yashodh.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;
    @Override
    public Category saveCategory(Category category, SalonDTO salonDTO) {
        return null;
    }

    @Override
    public List<Category> getAllCategoriesBySalon(Long id) {
        return null;
    }

    @Override
    public Category getCategoryById(Long id) {
        return null;
    }

    @Override
    public void deleteCategoryById(Long id) {

    }
}
