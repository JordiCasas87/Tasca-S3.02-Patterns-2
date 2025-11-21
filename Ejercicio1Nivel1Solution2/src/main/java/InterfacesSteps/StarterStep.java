package InterfacesSteps;

public interface StarterStep {

    MainCourseStep withMainCourse (String mainCourse);
    StarterStep isVegan ();
    StarterStep glutenFree();

}
