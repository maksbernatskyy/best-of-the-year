package org.lessons.java.best_of_the_year.controller;

import java.util.List;
import java.util.ArrayList;

import org.lessons.java.best_of_the_year.classes.Movie;
import org.lessons.java.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/bestMovies")
    public String bestMovies(Model model) {
        model.addAttribute("movies", getBestMovies());
        return "bestMovies";
    }

    @GetMapping("/bestSongs")
    public String bestSongs(Model model) {
        model.addAttribute("songs", getBestSongs());
        return "bestSongs";
    }

    @GetMapping("/bestMovies/{id}")
    public String detailMovie(@PathVariable("id") int movieId, Model model) {
        List<Movie> movies = getBestMovies();
        Movie movie = movies.get(movieId - 1);
        model.addAttribute("movieDetail", movie);
        return "detailMovie";
    }

    @GetMapping("/bestSongs/{id}")
    public String detailSong(@PathVariable("id") int songId, Model model) {
        List<Song> songs = getBestSongs();
        Song song = songs.get(songId - 1);
        model.addAttribute("songDetail", song);
        return "detailSong";
    }
    
    
    
    
}
