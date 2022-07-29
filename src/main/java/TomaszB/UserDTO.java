package TomaszB;

public class UserDTO implements Cloneable {
    private Long id;
    private String nickname;

    public UserDTO(Long id, String nickname) {
        this.id = id;
        this.nickname = nickname;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
