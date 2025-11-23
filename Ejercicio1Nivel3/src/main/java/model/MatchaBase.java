package model;

import interficies.BubbleTea;

public class MatchaBase implements BubbleTea {


    @Override
    public String getDescription() {
        return "Bubble Tea con base Matcha";
    }

    @Override
    public double getCost() {
        return 5;
    }
}
