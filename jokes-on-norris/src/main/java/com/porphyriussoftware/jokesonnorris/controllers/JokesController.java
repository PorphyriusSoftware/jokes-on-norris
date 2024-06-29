package com.porphyriussoftware.jokesonnorris.controllers;


import com.porphyriussoftware.jokesonnorris.services.JokeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class JokesController {

    private final JokeService jokeService;

    @GetMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", jokeService.getJoke());
        model.addAttribute("extraJoke", jokeService.getJoke());
        model.addAttribute("extraExtraJoke", jokeService.getJoke());
        return "index";
    }
}
