package uz.akbarali.foodbotwithreact.bot.util;

import org.springframework.stereotype.Service;
import uz.akbarali.foodbotwithreact.bot.dto.UserActivityDto;

import java.util.HashMap;
import java.util.Map;
@Service
public class UserUtil {
    public Map<Long, UserActivityDto> activityMap = new HashMap<>();
}
