package TomaszB;

import javax.persistence.*;


@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nickname;
    private String password;
    private String email;
    @OneToOne
    private UserDetails userDetails;

    public User() {
    }



    public User(Long id, String nickname, String password, String email) {
        this.id = id;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
    }

    public User(String nickname, String password, String email, UserDetails userDetails) {
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.userDetails = userDetails;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(UserDetails userDetails) {
        this.userDetails = userDetails;
    }

    public static final class UserBuilder {
        private User user;

        private UserBuilder() {
            user = new User();
        }

        public static UserBuilder anUser() {
            return new UserBuilder();
        }

        public UserBuilder withId(Long id) {
            user.setId(id);
            return this;
        }

        public UserBuilder withNickname(String nickname) {
            user.setNickname(nickname);
            return this;
        }

        public UserBuilder withPassword(String password) {
            user.setPassword(password);
            return this;
        }

        public UserBuilder withEmail(String email) {
            user.setEmail(email);
            return this;
        }

        public UserBuilder withUserDetails(UserDetails userDetails) {
            user.setUserDetails(userDetails);
            return this;
        }

        public User build() {
            return user;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", userDetails=" + userDetails +
                '}';
    }
}
