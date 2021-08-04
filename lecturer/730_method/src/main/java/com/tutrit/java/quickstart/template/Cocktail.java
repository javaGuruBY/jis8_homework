package com.tutrit.java.quickstart.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Cocktail {
    Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

    public final void makeCocktail() {
        takeMoney();
        takeAGlass();
        addIngredients();
        mixUp();
    }

    private final void takeMoney() {
        log.info("Thanks! Wait a minute!");
    }

    private final void takeAGlass() {
        log.info("Got a glass");
    }

    protected abstract void addIngredients();

    private final void mixUp() {
        log.info("mixing up!");
    }
}
