package ro.itschool.banking_system.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class BankingService implements AbstractService {

    @PostConstruct
    public void init() {
        System.out.println("post construct BankingService");
    }

    // The @PreDestroy annotation is used on methods as a callback notification to signal that the instance is in the process of being removed by the container.
    @PreDestroy
    public void destroy() {
        System.out.println("pre destroy BankingService");
    }

    @Override
    public void doSomething() {
        System.out.println("BankingService do something");
    }

}
