package ua.start.query.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ua.start.model.Car;
import ua.start.model.User;
import ua.start.query.TypeRepository;

@Configuration
public class ServiceConfiguration {

    @Bean
    public TypeRepository<Car> carRepository() {
        return new TypeRepository<>(Car.class);
    }

    @Bean
    public TypeRepository<User> userRepository() {
        return new User();
    }
}
