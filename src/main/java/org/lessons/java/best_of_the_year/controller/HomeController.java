package org.lessons.java.best_of_the_year.controller;

import java.util.List;
import java.util.ArrayList;

import org.lessons.java.best_of_the_year.classes.Movie;
import org.lessons.java.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class HomeController{

    @GetMapping("/")
    public String home() {
        return "home";
    }
    
    @GetMapping("/bestOfTheYear")
    public String bestOfTheYear(Model model, @RequestParam(name = "name") String name) {
        model.addAttribute("name", name);
        return "bestOfTheYear";
    }
    
    private List<Movie> getBestMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie(1, "The Vanilla Sky"));
        movies.add(new Movie(2, "Avengers: Endgame"));
        movies.add(new Movie(3, "Zootropolis"));

        return movies;
    }

    private List<Song> getBestSongs() {
        List<Song> songs = new ArrayList<>();

        songs.add(new Song(1, "Separate Ways"));
        songs.add(new Song(2, "Without Me"));
        songs.add(new Song(3, "Fellini"));

        return songs;
    }
}
