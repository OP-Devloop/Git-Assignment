package se.iths.oscarp.GitAssignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.oscarp.GitAssignment.model.ClothingStore;
import se.iths.oscarp.GitAssignment.model.Library;
import se.iths.oscarp.GitAssignment.service.ClothingStoreService;

import java.util.List;

@Controller
@RequestMapping("/clothing")
public class ClothingStoreController {
    private final ClothingStoreService clothingStoreService;

    public ClothingStoreController(ClothingStoreService clothingStoreService) {
        this.clothingStoreService = clothingStoreService;
    }

    @GetMapping
    public String getClothing(Model model) {
        List<ClothingStore> clothingStoreList = clothingStoreService.getClothing();
        model.addAttribute("clothes", clothingStoreList);
        return "clothing";
    }
}
