package se.iths.oscarp.GitAssignment.service;

import org.springframework.stereotype.Service;
import se.iths.oscarp.GitAssignment.model.Car;

import java.util.List;

@Service
public class CarService {
    public List<Car> carList() {
        return List.of(
                new Car("Volvo", "ex30", "Black"),
                new Car("Volvo", "v90", "Grey"),
                new Car("BMW", "iX1", "Withe"),
                new Car("Toyota", "RAV4", "Blue")
        );
    }
}
