package TomaszB;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Configuration
@EnableEncryptableProperties
@PropertySource("spring.datasource.username")
public class Bean {
    @Value("${spring.datasource.username}")
    private String haslo;

    public String getHaslo() {
        return haslo;
    }

    public Bean() {
        System.out.println("dfssssss");
        System.out.println(haslo);
    }

    @EventListener(ApplicationReadyEvent.class)
    void showw(){
        System.out.println("sddddddddd");
        System.out.println(haslo);
    }
}
