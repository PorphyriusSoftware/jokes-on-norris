package com.porphyriussoftware.jokesonnorris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;


@Service
public class JokesServiceImplementation implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokesServiceImplementation() {
        this.chuckNorrisQuotes=new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
