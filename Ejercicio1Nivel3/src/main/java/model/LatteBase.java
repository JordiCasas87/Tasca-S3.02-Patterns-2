package model;

import interficies.BubbleTea;

public class LatteBase implements BubbleTea {


    @Override
    public String getDescription() {
        return "Bubble Tea con base latte";
    }

    @Override
    public double getCost() {
        return 4;
    }
}
