package builder;

import InterfacesSteps.*;

public class MenuBuilder implements CoffeeStep, DessertStep, DrinkStep, MainCourseStep, StarterStep, StartStep, FinalStep {

    private String starter;
    private String mainCourse;
    private String supplement = "sin suplemento";
    private boolean vegan = false;
    private boolean glutenFree= false;
    private String dessert;
    private String coffee;
    private String drink;

    public MenuBuilder() {
    }

    @Override
    public CoffeeStep withCoffee(String coffee) {
        this.coffee = coffee;
        return this;
    }

    @Override
    public MainCourseStep withSupplement(String supplement) {
        if (this.mainCourse == null) {
            throw new IllegalStateException("No puedes añadir suplemento sin plato principal.");
        }
        this.supplement = supplement;
        return this;
    }

    @Override
    public DessertStep withDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    @Override
    public DrinkStep withDrink(String drink) {
        this.drink = drink;
        return this;
    }

    @Override
    public StarterStep withStarter(String starter) {
        this.starter = starter;
        return this;
    }

    @Override
    public MainCourseStep withMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }

    @Override
    public MenuBuilder isVegan() {
        if(this.mainCourse == null && this.starter == null)
            throw new IllegalStateException("El menu no puede ser vegano si no hay entrante o plato principal");

        this.vegan = true;
        return this;
    }

    @Override
    public MenuBuilder glutenFree() {
        this.glutenFree = true;
        return this;
    }


    @Override
    public Menu build() {
        return new Menu (starter, mainCourse,supplement,vegan,glutenFree,dessert, coffee, drink);

    }
}



