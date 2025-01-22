package ro.itschool.banking_system.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ro.itschool.banking_system.service.AbstractService;
import ro.itschool.banking_system.service.BankingService;

// The new lines do not break the syntax.

// @Configuration annotation is used to declare a class as a configuration class.
// A configuration class is a class that contains methods annotated with @Bean.
@Configuration
public class BankingConfiguration {

    // @Bean annotation is used to declare a method as a bean.
    // A bean is an object that is managed by the Spring IoC container.
    // When the Spring IoC container is started, it creates an instance of the bean and stores it in its context.
    @Bean
    // @Primary annotation is used to specify that a bean should be given precedence when multiple beans of the same type are present in the context.
    @Primary
    // When the bankingService() method is called, it creates a new instance of the BankingService class and returns it.
    // We have used AbstractService as the return type of the method, so the method can return any class that implements the AbstractService interface.
    public AbstractService bankingService() {
        System.out.println("BankingService bean created");
        return new BankingService();
    }

}
