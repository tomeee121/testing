package TomaszB;

public class UserBuilderDTO {
    public static User getZiomka123(User user) {
        return User.UserBuilder.anUser().withId(user.getId()).withEmail(user.getEmail()).withNickname(user.getNickname()).build();
    }
}
