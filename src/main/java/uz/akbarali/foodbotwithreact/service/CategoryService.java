package uz.akbarali.foodbotwithreact.service;

import org.springframework.http.HttpEntity;
import org.springframework.validation.Errors;
import uz.akbarali.foodbotwithreact.dto.CategoryDto;
import uz.akbarali.foodbotwithreact.payload.ApiResponse;

import java.util.UUID;

public interface CategoryService {
    HttpEntity<ApiResponse> getAllCategory();

    HttpEntity<?> getCategoryById(UUID id);

    HttpEntity<?> saveCategory(CategoryDto productDto, Errors error);

    HttpEntity<?> deleteCategoryById(UUID id);
}
