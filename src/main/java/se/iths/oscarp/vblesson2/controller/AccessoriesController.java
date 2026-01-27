package se.iths.oscarp.vblesson2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.oscarp.vblesson2.model.Accessories;
import se.iths.oscarp.vblesson2.service.AccessoriesService;

import java.util.List;

@Controller
@RequestMapping("/accessories")
public class AccessoriesController {

    private final AccessoriesService accessoriesService;

    public AccessoriesController(AccessoriesService accessoriesService) {
        this.accessoriesService = accessoriesService;
    }

    @GetMapping
    public String Accessories(Model model) {
        List<Accessories> accessoriesList = accessoriesService.AccessoriesList();
        model.addAttribute("acList", accessoriesList);
        return "accessories";
    }
}
