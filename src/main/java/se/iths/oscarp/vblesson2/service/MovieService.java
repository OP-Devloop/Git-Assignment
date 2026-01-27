package se.iths.oscarp.vblesson2.service;

import org.springframework.stereotype.Service;
import se.iths.oscarp.vblesson2.model.Movie;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {
    public List<Movie> movieList() {
        ArrayList<Movie> movieList = new ArrayList<>();
        Movie movie1 = new Movie("Interstellar", "Christopher Nolan", 2014);
        Movie movie2 = new Movie("Shutter Island", "Martin Scorsese", 2010);
        Movie movie3 = new Movie("Inglourious Basterds", "Quentin Tarantino", 2009);
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        return movieList;
    }
}
