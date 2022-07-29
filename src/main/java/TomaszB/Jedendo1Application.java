package TomaszB;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.EventListener;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.apache.logging.log4j.LogManager.getLogger;

@SpringBootApplication
@EnableEncryptableProperties
public class Jedendo1Application {

    final static Logger logger = getLogger(Jedendo1Application.class);
//    static Logger logger2 = LoggerFactory.getLogger(Jedendo1Application.class);


    public Jedendo1Application() {
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void putValues(@Value("${mee}") String haslo) {
//        this.haslo = haslo;
//        System.out.println(haslo);
//    }

    private Bean bean;

    public Jedendo1Application(Bean bean) {
        this.bean = bean;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Motor ścigacz = new Motor(300, "ścigacz", 0);
        Motor motor = new Motor(50, " miejski", 2);
        Motor motor1 = new Motor();
        motor1.add(ścigacz);
        motor1.add(motor);
        F1 mclaren = new F1(400, " McLaren", 12500);
        F1 redbull = new F1(412, " RedBull", 13000);
        F1 f1 = new F1();
        f1.add(mclaren);
        f1.add(redbull);

        motor1.getMotors();
        Car car = new Car();
        car.add(motor1.getMotors().toArray(new Motor[0]));
        car.add(f1.getF1s().toArray(new F1[0]));

        car.getCars().stream().map(Car::description).forEach(System.out::println);

        logger.info("kkk");
//        logger2.info("tyyyyyyyyyy");
        User user = new User(1L, "dv", "sdfsfd", "sdffsdsfdf");
        User user2 = new User(2L, "dv", "sdfsfd", "sdffsdsfdf");
        List<User> users = Arrays.asList(user, user2);
        List<UserDTO> extracted = PostDTOMapper.extracted(users);
        System.out.println(extracted);
        for (UserDTO userDTO : extracted) {
            Object clone = userDTO.clone();
        }

        List<User> collected = users.stream().map(UserBuilderDTO::getZiomka123).collect(Collectors.toList());
        System.out.println(collected);



        ConfigurableApplicationContext context = SpringApplication.run(Jedendo1Application.class, args);
        try{
        UserDetailsRepo repoDetails = context.getBean(UserDetailsRepo.class);
        repoDetails.save(new UserDetails("aa", "aa", "zz"));}
        catch(Exception e){
            logger.fatal(e.getMessage());
        }

    }


}
