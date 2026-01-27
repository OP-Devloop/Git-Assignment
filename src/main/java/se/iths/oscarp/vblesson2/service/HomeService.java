package se.iths.oscarp.vblesson2.service;

import org.springframework.stereotype.Service;

@Service
public class HomeService {
    public String helloFromService() {
        return "Welcome";
    }
}
