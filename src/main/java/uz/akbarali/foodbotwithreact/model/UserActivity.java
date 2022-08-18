package uz.akbarali.foodbotwithreact.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.akbarali.foodbotwithreact.model.enums.Role;
import uz.akbarali.foodbotwithreact.model.template.AbsEntity;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserActivity extends AbsEntity {
    private Long chatId;
    private int round;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;


}
