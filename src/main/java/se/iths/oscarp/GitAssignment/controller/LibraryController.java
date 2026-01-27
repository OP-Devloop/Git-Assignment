package se.iths.oscarp.GitAssignment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.oscarp.GitAssignment.model.Library;
import se.iths.oscarp.GitAssignment.model.Movie;
import se.iths.oscarp.GitAssignment.service.LibraryService;

import java.util.List;

@Controller
@RequestMapping("/library")
public class LibraryController {
    private final LibraryService libraryService;


    public LibraryController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @GetMapping
    public String getBooks(Model model) {
        List<Library> libraryList = libraryService.libraryList();
        model.addAttribute("books", libraryList);
        return "library";
    }

}
