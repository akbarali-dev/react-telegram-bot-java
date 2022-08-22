package uz.akbarali.foodbotwithreact.repository;

import org.springframework.data.jpa.repository.Query;
import uz.akbarali.foodbotwithreact.model.Product;
import uz.akbarali.foodbotwithreact.projection.IdProjection;
import uz.akbarali.foodbotwithreact.projection.ProductProjection;
import uz.akbarali.foodbotwithreact.repository.base.BaseRepository;

import java.util.List;
import java.util.UUID;

public interface ProductRepository extends BaseRepository<Product> {
//    @Query(nativeQuery = true,
//    value = "select name_uz as name,\n" +
//            "       price, ac.data\n" +
//            "from product p\n" +
//            "join attachments a on a.id = p.attachment_id\n" +
//            "join attachment_contents ac on a.id = ac.attachment_id")
//    List<ProductProjection> getAllProduct();



    @Query(nativeQuery = true,
            value = "select cast(p.id as varchar) as id,\n" +
                    "       name_uz               as name,\n" +
                    "       price,\n" +
                    "       ac.data as image\n" +
                    "from product p\n" +
                    "         join attachments a on a.id = p.attachment_id\n" +
                    "         join attachment_contents ac on a.id = ac.attachment_id\n" +
                    "where p.category_id = :categoryId")
    List<ProductProjection> getAllFood(UUID categoryId);
}
