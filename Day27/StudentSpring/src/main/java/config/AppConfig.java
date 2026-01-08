package config;

import beans.Car;
import beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public User user(){
        return new User();
    }

    @Bean
    public Car car(){
        return new Car();
    }
}
