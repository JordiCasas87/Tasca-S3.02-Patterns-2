package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MenuBuilderTest {


    @Test
    void whenBuildExecutiveMenuFullOptions_thenItsCreatedSuccessfully() {
        Menu executiveMenu = new MenuBuilder()
                .withStarter("croqueta")
                .isVegan()
                .glutenFree()
                .withMainCourse("Pollo")
                .withSupplement("patatas")
                .withDessert("helado")
                .withDrink("agua")
                .build();

        assertAll(
                () -> assertEquals("croqueta", executiveMenu.getStarter()),
                () -> assertTrue(executiveMenu.isVegan()),
                () -> assertTrue(executiveMenu.isGlutenFree()),
                () -> assertEquals("Pollo", executiveMenu.getMainCourse()),
                () -> assertEquals("helado", executiveMenu.getDessert()),
                () -> assertEquals("agua", executiveMenu.getDrink())
        );

    }

    @Test
    void whenBuildKidsMenuFullOptions_thenItsCreatedSuccessfully() {
        Menu MenuKids = new MenuBuilder()

                .withMainCourse("Pollo")
                .withDessert("helado")
                .withDrink("agua")
                .build();

        assertAll(

                () -> assertEquals("Pollo", MenuKids.getMainCourse()),
                () -> assertEquals("helado", MenuKids.getDessert()),
                () -> assertEquals("agua", MenuKids.getDrink())
        );


    }

    @Test
    void whenBuildMenuFullOptions_thenItsCreatedSuccessfully() {
        Menu halfMenu = new MenuBuilder()

                .withMainCourse("Pollo")
                .isVegan()
                .withCoffee("capuchino")
                .withDrink("agua")
                .build();

        assertAll(

                () -> assertEquals("Pollo", halfMenu.getMainCourse()),
                () -> assertTrue(halfMenu.isVegan()),
                () -> assertEquals("capuchino", halfMenu.getCoffee()),
                () -> assertEquals("agua", halfMenu.getDrink())
        );

    }


    @Test
    void whenBuilMenuWrongInMainCourse_thenThrowException() { //no puede ser vegano si plato principal o entrante

        assertThrows(IllegalStateException.class, () -> {
            new MenuBuilder()
                    .isVegan()
                    .withCoffee("capuchino")
                    .withDrink("agua")
                    .build();
        }
        );

    }


    @Test
    void whenBuildMenuWrongInSupplement_thenThrowException() { // no puede tener suplemento sin plato principal

        assertThrows(IllegalStateException.class, () -> {
                    new MenuBuilder()
                            .withSupplement("Patatas")
                            .isVegan()
                            .withCoffee("capuchino")
                            .withDrink("agua")
                            .build();
                }
        );

    }


}

