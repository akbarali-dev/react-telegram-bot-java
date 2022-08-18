package uz.akbarali.foodbotwithreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.akbarali.foodbotwithreact.model.UserActivity;

import java.util.UUID;

public interface UserActivityRepository extends JpaRepository<UserActivity, UUID> {

    boolean existsByChatId(Long chatId);
}
