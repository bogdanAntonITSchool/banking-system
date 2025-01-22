package ro.itschool.banking_system.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// The @Service annotation is a specialization of the @Component annotation with no other features.
// We can use @Service over @Component in service-layer classes because it specifies intent better.
// We can also pass the name of the bean as an argument to the @Service annotation.
@Service("salut")
public class UserService implements AbstractService {

    // The @Autowired annotation is used to inject a bean by type.
    @Autowired
    // The @Qualifier annotation is used to specify which bean to autowire on multiple beans of the same type.
    @Qualifier("loginService")
    private AbstractService service;

    @PostConstruct
    public void init() {
        System.out.println("post construct UserService");
        service.doSomething();
    }

    @Override
    public void doSomething() {
        System.out.println("UserService do something");
    }

}
