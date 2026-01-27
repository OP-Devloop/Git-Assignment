package se.iths.oscarp.vblesson2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import se.iths.oscarp.vblesson2.model.Movie;
import se.iths.oscarp.vblesson2.service.MovieService;

import java.util.List;

@Controller
@RequestMapping
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService, MovieService movieService1) {
        this.movieService = movieService1;
    }

    @GetMapping("/movies")
    public String getMovies(Model model) {
        List<Movie> movieList = movieService.movieList();
        model.addAttribute("movies", movieList);
        return "movie";
    }
}
