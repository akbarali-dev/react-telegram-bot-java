package uz.akbarali.foodbotwithreact.projection;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.rest.core.config.Projection;
import uz.akbarali.foodbotwithreact.model.Category;

import java.util.List;
@Projection(types = {Category.class})
public interface CategoryProjection extends IdProjection {
    String getName();
    @Value("#{@productRepository.getAllFood(target.id)}")
    List<ProductProjection> getFoods();
}
