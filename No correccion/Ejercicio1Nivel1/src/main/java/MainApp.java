import model.Menu;
import model.MenuBuilder;

public class MainApp {

    public static void main(String[] args) {

        // 1) Executive Menu
        Menu executiveMenu = MenuBuilder.start()
                .withStarter("Amanida Mediterrània")
                .isVegan()
                .isGlutenFree()
                .withMainCourse("Filet de Vedella")
                .withSuplement("Guarnició extra")
                .withDessert("Mousse de xocolata")
                .withDrink("Vi Negre")
                .build();

        System.out.println("Executive Menu:");
        System.out.println(executiveMenu);
        System.out.println();


        Menu kidsMenu = MenuBuilder.start()
                .withMainCourse("Macarrons amb tomàquet")
                .withDessert("Gelat de Vainilla")
                .withDrink("Suc de taronja")
                .build();

        System.out.println("Kids Menu:");
        System.out.println(kidsMenu);
        System.out.println();


        Menu halfMenu = MenuBuilder.start()
                .withMainCourse("Risotto de bolets")
                .isVegan()
                .withCoffee("Espresso")
                .withDrink("Aigua")
                .build();

        System.out.println("Half Menu:");
        System.out.println(halfMenu);

    }

    }



