package uz.akbarali.foodbotwithreact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.akbarali.foodbotwithreact.payload.ApiResponse;
import uz.akbarali.foodbotwithreact.service.CategoryService;
import uz.akbarali.foodbotwithreact.service.ProductService;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping
    public HttpEntity<ApiResponse> getAllProduct(){
        return categoryService.getAllCategory();
    }

}
