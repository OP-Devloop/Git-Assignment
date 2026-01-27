package se.iths.oscarp.GitAssignment.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public String helloFromService() {
        return "Welcome";
    }
}
