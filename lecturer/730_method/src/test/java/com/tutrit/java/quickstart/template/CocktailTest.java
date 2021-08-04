package com.tutrit.java.quickstart.template;

import static org.junit.Assert.*;

import java.util.List;
import org.junit.Before;
import org.junit.Test;

public class CocktailTest {

    @Test
    public void makeCocktail() {
        List<Cocktail> allIKnowToHaveAGoodFriday = List.of(
                new CosmopolitanCocktail(),
                new LimeCocktail(),
                new MargaritaCocktail(),
                new MochitoCocktail(),
                new BloodyMary()
        );

        allIKnowToHaveAGoodFriday.forEach(Cocktail::makeCocktail);
    }
}