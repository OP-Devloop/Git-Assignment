package se.iths.oscarp.vblesson2.service;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import se.iths.oscarp.vblesson2.model.User;

import java.util.List;

@Service
public class UserService {
    public String helloFromServer() {
        return "Welcome";
    }

    public String userList(Model model) {
        List<User> users = List.of(
                new User("Anna", 25),
                new User("Bert", 32),
                new User("Charly", 22)
        );
        model.addAttribute("users", users);
        return "user";
    }
}
