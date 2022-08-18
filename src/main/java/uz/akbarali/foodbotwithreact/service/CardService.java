package uz.akbarali.foodbotwithreact.service;


import org.springframework.http.HttpEntity;
import org.springframework.validation.Errors;
import uz.akbarali.foodbotwithreact.dto.CardDto;
import uz.akbarali.foodbotwithreact.dto.ProductDto;
import uz.akbarali.foodbotwithreact.payload.ApiResponse;

import java.util.UUID;

public interface CardService {
    HttpEntity<ApiResponse> getAllCard();

    HttpEntity<?> getCardById(UUID id);

    HttpEntity<?> saveCard(CardDto productDto, Errors error);

    HttpEntity<?> deleteCardById(UUID id);
}
