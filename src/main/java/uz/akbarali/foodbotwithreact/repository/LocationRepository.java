package uz.akbarali.foodbotwithreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.akbarali.foodbotwithreact.model.Location;
import uz.akbarali.foodbotwithreact.model.Product;

import java.util.UUID;

public interface LocationRepository extends JpaRepository<Location, UUID> {
}
