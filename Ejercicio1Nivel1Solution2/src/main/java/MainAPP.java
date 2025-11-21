import InterfacesSteps.*;
import builder.Menu;
import builder.MenuBuilder;

public class MainAPP {

    public static void main(String[] args) {

        Menu menuExecutive = new MenuBuilder()
                .withStarter("Croquetas")
                    .isVegan()
                .withMainCourse("Pollo")
                    .withSupplement("Patatas fritas")
                .withDessert("Helado")
                .withDrink("agua")
                .build();

        System.out.println(menuExecutive.toString());


        Menu menuKids = new MenuBuilder()
                .withMainCourse("Macarrones")
                .withDessert("Galletas")
                .withDrink("Zumo")
                .build();

        System.out.println(menuKids.toString());

        Menu halfMenu = new MenuBuilder()
                .withMainCourse("Escalope de Ballena")
                .isVegan()
                .withCoffee("capuccino")
                .withDrink("vino")
                .build();

        System.out.println(halfMenu.toString());








    }
}
