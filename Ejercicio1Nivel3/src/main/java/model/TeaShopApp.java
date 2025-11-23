package model;


import decorators.Flavor;
import decorators.Ice;
import decorators.Sugar;
import decorators.Tapioca;
import interficies.BubbleTea;


public class TeaShopApp {

    public static void main(String[] args) {

        BubbleTea tea = new MatchaBase();
        tea = new Tapioca(tea);
        tea = new Sugar(tea);
        tea = new Ice(tea);
        tea = new Flavor(tea,"Banana");

        System.out.println(tea.getDescription());



    }

}
