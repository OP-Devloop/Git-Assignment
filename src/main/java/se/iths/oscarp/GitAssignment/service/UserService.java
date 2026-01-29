package se.iths.oscarp.GitAssignment.service;

import org.springframework.stereotype.Service;
import se.iths.oscarp.GitAssignment.model.User;

import java.util.List;

@Service
public class UserService {
    public String helloFromServer() {
        return "Welcome";
    }

    public List<User> userList() {
        return List.of(
                new User(1, "Anna", 25),
                new User(2, "Bert", 32),
                new User(3, "Charly", 22)
        );
    }
}
