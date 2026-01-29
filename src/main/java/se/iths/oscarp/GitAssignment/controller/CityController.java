package se.iths.oscarp.GitAssignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.iths.oscarp.GitAssignment.model.City;
import se.iths.oscarp.GitAssignment.service.CityService;

import java.util.List;

@Controller
public class CityController {
    private final CityService cityService;

    public CityController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping("/city")
    public String city(Model model) {
        List<City> cities = cityService.cityList();
        model.addAttribute("city", cities);
        return "city";
    }
}
