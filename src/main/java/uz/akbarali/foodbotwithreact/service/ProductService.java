package uz.akbarali.foodbotwithreact.service;

import org.springframework.http.HttpEntity;
import org.springframework.validation.Errors;
import uz.akbarali.foodbotwithreact.dto.ProductDto;
import uz.akbarali.foodbotwithreact.payload.ApiResponse;

import java.util.UUID;

public interface ProductService {

    HttpEntity<ApiResponse> getAllProduct();

    HttpEntity<?> getProductById(UUID id);

    HttpEntity<?> saveProduct(ProductDto productDto, Errors error);

    HttpEntity<?> deleteProductById(UUID id);
}
