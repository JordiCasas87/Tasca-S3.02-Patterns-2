package InterfacesSteps;

import builder.Menu;

public interface DrinkStep {
    DrinkStep withDrink (String drink);
    Menu build();

}
