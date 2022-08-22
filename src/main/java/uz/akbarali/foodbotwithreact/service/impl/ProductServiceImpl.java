package uz.akbarali.foodbotwithreact.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import uz.akbarali.foodbotwithreact.dto.ProductDto;
import uz.akbarali.foodbotwithreact.payload.ApiResponse;
import uz.akbarali.foodbotwithreact.projection.ProductProjection;
import uz.akbarali.foodbotwithreact.repository.CategoryRepository;
import uz.akbarali.foodbotwithreact.repository.ProductRepository;
import uz.akbarali.foodbotwithreact.service.AnswerService;
import uz.akbarali.foodbotwithreact.service.ProductService;

import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    AnswerService answerService;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public HttpEntity<ApiResponse> getAllProduct() {
//        return answerService.answer("SUCCESS", true, productRepository.getAll(), HttpStatus.OK);
        return answerService.getAllObject(categoryRepository);
    }

    @Override
    public HttpEntity<?> getProductById(UUID id) {
        return null;
    }

    @Override
    public HttpEntity<?> saveProduct(ProductDto productDto, Errors error) {
        return null;
    }

    @Override
    public HttpEntity<?> deleteProductById(UUID id) {
        return null;
    }
}
