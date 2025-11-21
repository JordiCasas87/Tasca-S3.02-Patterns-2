package model;

import interfaces.RequiresMainCourse;

public class MenuBuilder implements RequiresMainCourse {

    private String starter;
    private String mainCourse;
    private String dessert;
    private String drink;
    private String coffee;

    private boolean vegan;
    private boolean glutenFree;

    private MenuBuilder() {}

    // Punto de entrada: obliga a empezar en RequiresMainCourse
    public static RequiresMainCourse start() {
        return new MenuBuilder();
    }


    // Primer paso obligatorio
    @Override
    public MenuBuilder withMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
        return this;
    }

    // Opcionales
    @Override
    public RequiresMainCourse withStarter(String starter) {
        this.starter = starter;
        return this;
    }


    public MenuBuilder withDessert(String dessert) {
        this.dessert = dessert;
        return this;
    }

    public MenuBuilder withDrink(String drink) {
        this.drink = drink;
        return this;
    }

    public MenuBuilder withCoffee(String coffee) {
        this.coffee = coffee;
        return this;
    }

    public MenuBuilder withSuplement(String suplement) {
        this.mainCourse = this.mainCourse + " + " + suplement;
        return this;
    }

    @Override
    public MenuBuilder isVegan() {
        this.vegan = true;
        return this;
    }


    @Override
    public MenuBuilder isGlutenFree() {
        this.glutenFree = true;
        return this;
    }



    // Validación final suave
    public Menu build() {

        if (this.mainCourse == null) {
            throw new IllegalStateException("No puedes construir un menú sin plato principal.");
        }

        if (coffee != null && dessert != null) {
            throw new IllegalStateException("No puedes pedir café y postre en el mismo menú.");
        }

        return new Menu(
                starter,
                mainCourse,
                dessert,
                drink,
                coffee,
                vegan,
                glutenFree
        );
    }
}
