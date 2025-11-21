package builder;

public class Menu {

    private String starter;
    private String mainCourse;
    private String supplement = "sin suplemento";
    private boolean vegan = false;
    private boolean glutenFree= false;
    private String dessert;
    private String coffee;
    private String drink;


     Menu(String starter, String mainCourse, String supplement, boolean vegan, boolean glutenFree, String dessert, String coffee, String drink) {
        this.starter = starter;
        this.mainCourse = mainCourse;
        this.supplement = supplement;
        this.vegan = vegan;
        this.glutenFree = glutenFree;
        this.dessert = dessert;
        this.coffee = coffee;
        this.drink = drink;
    }

    public String getStarter() {
        return starter;
    }

    public String getMainCourse() {
        return mainCourse;
    }

    public String getSupplement() {
        return supplement;
    }

    public boolean isVegan() {
        return vegan;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public String getDessert() {
        return dessert;
    }

    public String getCoffee() {
        return coffee;
    }

    public String getDrink() {
        return drink;
    }


    @Override
    public String toString() {
        return "Menu{" +
                "starter='" + starter + '\'' +
                ", mainCourse='" + mainCourse + '\'' +
                ", supplement='" + supplement + '\'' +
                ", vegan=" + vegan +
                ", glutenFree=" + glutenFree +
                ", dessert='" + dessert + '\'' +
                ", coffee='" + coffee + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
