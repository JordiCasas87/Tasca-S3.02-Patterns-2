package decorators;

import interficies.BubbleTea;
import model.BubbleTeaDecorator;

public class Tapioca extends BubbleTeaDecorator {
    public Tapioca(BubbleTea decoratedBubbleTea) {
        super(decoratedBubbleTea);
    }


    @Override
    public String getDescription() {
        return super.getDescription()+ ", Tapicoa";
    }

    @Override
    public double getCost() {
        return super.getCost()+2;
    }
}
