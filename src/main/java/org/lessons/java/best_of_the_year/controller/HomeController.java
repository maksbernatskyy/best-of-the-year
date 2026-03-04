package org.lessons.java.best_of_the_year.controller;

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
}
