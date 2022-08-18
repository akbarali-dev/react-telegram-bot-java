package uz.akbarali.foodbotwithreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import uz.akbarali.foodbotwithreact.model.Card;
import uz.akbarali.foodbotwithreact.model.Product;
import uz.akbarali.foodbotwithreact.projection.IdProjection;
import uz.akbarali.foodbotwithreact.repository.base.BaseRepository;

import java.util.List;
import java.util.UUID;

public interface CardRepository extends BaseRepository<Card> {


}
