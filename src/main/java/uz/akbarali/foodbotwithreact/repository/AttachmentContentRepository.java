package uz.akbarali.foodbotwithreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.akbarali.foodbotwithreact.model.AttachmentContent;
import uz.akbarali.foodbotwithreact.model.Product;

import java.util.UUID;

public interface AttachmentContentRepository extends JpaRepository<AttachmentContent, UUID> {
}
