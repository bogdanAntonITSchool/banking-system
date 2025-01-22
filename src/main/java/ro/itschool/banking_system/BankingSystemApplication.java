package ro.itschool.banking_system;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.itschool.banking_system.service.BankingService;
import ro.itschool.banking_system.service.LoginService;
import ro.itschool.banking_system.service.UserService;

// The @SpringBootApplication annotation is doing the following:
// - @Configuration: tags the class as a source of bean definitions for the application context
// - @EnableAutoConfiguration: tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings
// - @ComponentScan: tells Spring to look for other components, configurations, and services in the ro.itschool.banking_system package, letting it find the controllers
// - @SpringBootConfiguration: is a specialized form of the @Configuration annotation that is used to mark the configuration classes that are used in Spring Boot applications
// - @EnableAutoConfiguration: tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings

// The @ComponentScan annotation is used with the @Configuration annotation to specify the packages that the Spring framework should scan for components, configurations, and services,
// but it can also be used with the @SpringBootApplication annotation to specify the packages that the Spring Boot application should scan for components, configurations, and services.
//@ComponentScan(basePackages = "ro.itschool.banking_system.service")
@SpringBootApplication
public class BankingSystemApplication {

    // The @Autowired annotation is used to let Spring know that it should inject an instance of the annotated class into the field.
    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        // The SpringApplication.run() method is used to start the Spring application.
        SpringApplication.run(BankingSystemApplication.class, args);
    }

    // The @PostConstruct annotation is a method-level annotation that is used to signal that the annotated method should be invoked after the bean has been constructed, but before the bean is returned to the caller.
    @PostConstruct
    public void init() {
        System.out.println("BankingSystemApplication started");

        // The getBean() method is used to retrieve a bean from the application context.
        // If the bean is not yet created, the getBean() method will create the bean and return it.
        UserService userService = (UserService) applicationContext.getBean("salut");
        System.out.println(userService);

        BankingService bankingService = (BankingService) applicationContext.getBean("bankingService");
        LoginService loginService = (LoginService) applicationContext.getBean("loginService");

        System.out.println(bankingService);
        System.out.println(loginService);
    }

}
