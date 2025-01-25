package ro.itschool.banking_system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.itschool.banking_system.model.User;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    /**
     * private static final String[] USERS = new String[]{
     * "User1",
     * "User2",
     * "User3",
     * "User4"
     * };
     */

    private static final List<User> USERS = new ArrayList<>();

    @GetMapping
    public List<User> getUsers() {
        return USERS;
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        USERS.add(user);
        return "User added";
    }

}
