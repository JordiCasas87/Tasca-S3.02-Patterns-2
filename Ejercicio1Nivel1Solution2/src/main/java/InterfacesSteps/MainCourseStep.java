package InterfacesSteps;

public interface MainCourseStep {
    MainCourseStep withSupplement (String supplement);
    DessertStep withDessert (String dessert);
    CoffeeStep withCoffee (String coffee);
    MainCourseStep isVegan();
    MainCourseStep glutenFree();
}
