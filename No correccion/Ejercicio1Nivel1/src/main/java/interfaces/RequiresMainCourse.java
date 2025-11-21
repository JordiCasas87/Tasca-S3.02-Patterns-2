package interfaces;

import model.MenuBuilder;

public interface RequiresMainCourse {
    RequiresMainCourse withStarter(String starter);
    MenuBuilder withMainCourse(String mainCourse);

    // Añadir estos para permitir restricciones nutricionales antes del main course:
    RequiresMainCourse isVegan();
    RequiresMainCourse isGlutenFree();
}
