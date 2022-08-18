package uz.akbarali.foodbotwithreact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.akbarali.foodbotwithreact.model.Attachment;
import uz.akbarali.foodbotwithreact.model.Product;

import java.util.UUID;

public interface AttachmentRepository extends JpaRepository<Attachment, UUID> {
}
