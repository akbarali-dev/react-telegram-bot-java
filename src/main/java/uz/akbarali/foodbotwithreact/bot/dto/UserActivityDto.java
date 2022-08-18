package uz.akbarali.foodbotwithreact.bot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.akbarali.foodbotwithreact.model.User;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserActivityDto {
    private Long chatId;
    private int round;
    private UUID userId;
}
