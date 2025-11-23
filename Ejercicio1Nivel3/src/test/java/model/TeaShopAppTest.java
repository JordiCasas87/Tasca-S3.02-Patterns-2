package model;

import decorators.Flavor;
import decorators.Ice;
import decorators.Sugar;
import decorators.Tapioca;
import interficies.BubbleTea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeaShopAppTest {


    @Test
    public void creationOfBubbleTea_isCorrect(){

        BubbleTea tea = new MatchaBase();
        tea = new Tapioca(tea);
        tea = new Sugar(tea);
        tea = new Ice(tea);
        tea = new Flavor(tea,"Banana");

        System.out.println(tea.getDescription());

        assertEquals (tea.getDescription(),"Bubble Tea con base Matcha, Tapicoa, bomba de azucar extra-diabeética, hielo, sabor a Banana");

    }


    @Test
    public void creationOfBubbleTea_diferentOrder_isCorrect(){

        BubbleTea tea = new MatchaBase();
        tea = new Tapioca(tea);
        tea = new Flavor(tea,"Banana");
        tea = new Ice(tea);
        tea = new Sugar(tea);

        System.out.println(tea.getDescription());

        assertEquals (tea.getDescription(),"Bubble Tea con base Matcha, Tapicoa, sabor a Banana, hielo, bomba de azucar extra-diabeética");

    }

}
