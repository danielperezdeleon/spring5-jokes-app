package com.immutableant.spring5jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisJoke implements JokeService {

  private final ChuckNorrisQuotes chuckNorrisQuotes;

  public ChuckNorrisJoke() {
    this.chuckNorrisQuotes = new ChuckNorrisQuotes();
  }

  @Override
  public String getJoke() {
    return chuckNorrisQuotes.getRandomQuote();
  }
}
