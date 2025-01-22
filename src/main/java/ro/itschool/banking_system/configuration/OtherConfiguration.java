package ro.itschool.banking_system.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.itschool.banking_system.service.AbstractService;
import ro.itschool.banking_system.service.LoginService;

// See the BankingConfiguration.java file for more information.
@Configuration
public class OtherConfiguration {

    @Bean
    public AbstractService loginService() {
        System.out.println("LoginService bean created");
        return new LoginService();
    }

}
