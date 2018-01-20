package com.chucknorris.jokes.services;

import com.chucknorris.jokes.models.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService
{
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl()
    {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke()
    {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
