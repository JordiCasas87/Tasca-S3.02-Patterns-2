
package model;

public class Menu {

    private String starter;
    private String mainCourse;
    private String dessert;
    private String drink;
    private String coffee;

    private boolean vegan;
    private boolean glutenFree;

    public Menu(String starter, String mainCourse, String dessert, String drink, String coffee,
                boolean vegan, boolean glutenFree) {

        this.starter = starter;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
        this.drink = drink;
        this.coffee = coffee;
        this.vegan = vegan;
        this.glutenFree = glutenFree;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "starter='" + starter + '\'' +
                ", mainCourse='" + mainCourse + '\'' +
                ", dessert='" + dessert + '\'' +
                ", drink='" + drink + '\'' +
                ", coffee='" + coffee + '\'' +
                ", vegan=" + vegan +
                ", glutenFree=" + glutenFree +
                '}';
    }
}


