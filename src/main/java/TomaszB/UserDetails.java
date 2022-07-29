package TomaszB;


import javax.persistence.*;
import java.util.Comparator;

@Entity
public class UserDetails /*implements Comparator<UserDetails>*/ {
//    public Comparator<UserDetails> comp = Comparator.comparingInt(UserDetails::getFirstName);


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Lob
    private String adress;
    private String firstName;
    private String lastName;

    public UserDetails() {
    }


    public UserDetails(String adress, String firstName, String lastName) {
        this.adress = adress;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
