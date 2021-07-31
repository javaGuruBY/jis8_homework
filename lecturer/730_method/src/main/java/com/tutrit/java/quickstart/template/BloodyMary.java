package com.tutrit.java.quickstart.template;

public class BloodyMary extends Cocktail{
    @Override
    protected void addIngredients() {
        log.info("Tomato juice, vodka");
    }
}
