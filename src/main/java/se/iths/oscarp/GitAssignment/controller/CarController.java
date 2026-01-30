package se.iths.oscarp.GitAssignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.oscarp.GitAssignment.model.Car;
import se.iths.oscarp.GitAssignment.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car")
    public String car(Model model) {
        List<Car> carList = carService.carList();
        model.addAttribute("car", carList);
        return "car";
    }
}
