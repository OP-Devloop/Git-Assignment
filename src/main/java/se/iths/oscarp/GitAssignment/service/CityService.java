package se.iths.oscarp.GitAssignment.service;

import org.springframework.stereotype.Service;
import se.iths.oscarp.GitAssignment.model.City;

import java.util.List;

@Service
public class CityService {
    public List<City> cityList() {
        return List.of(
                new City("Kingdom of Sweden", "Stockholm"),
                new City("Canada", "London"),
                new City("Kingdom of Great Britain", "York"),
                new City("Australia", "Byron Bay")
        );
    }
}
