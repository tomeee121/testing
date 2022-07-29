package TomaszB;

import java.util.List;
import java.util.stream.Collectors;

public class PostDTOMapper {
    public static List<UserDTO> extracted(List<User> users) {
        return users.stream().map(userJSON -> new UserDTO(userJSON.getId(), userJSON.getNickname())).collect(Collectors.toList());
    }
}
