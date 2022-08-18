package uz.akbarali.foodbotwithreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.akbarali.foodbotwithreact.model.Category;
import uz.akbarali.foodbotwithreact.model.Product;
import uz.akbarali.foodbotwithreact.projection.CategoryProjection;
import uz.akbarali.foodbotwithreact.projection.IdProjection;
import uz.akbarali.foodbotwithreact.repository.base.BaseRepository;

import java.util.List;
import java.util.UUID;

public interface CategoryRepository extends BaseRepository<Category> {
    @Override
            @Query(nativeQuery = true, value = "select cast(id as varchar),\n" +
                    "    name_uz as name\n" +
                    "from category")
    List<CategoryProjection> getAll();
}
