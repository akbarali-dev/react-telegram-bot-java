package uz.akbarali.foodbotwithreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.akbarali.foodbotwithreact.model.User;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

}
