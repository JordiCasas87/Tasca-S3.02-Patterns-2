package decorators;

import interficies.BubbleTea;
import model.BubbleTeaDecorator;

public class Ice  extends BubbleTeaDecorator {

    public Ice(BubbleTea decoratedBubbleTea) {
        super(decoratedBubbleTea);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", hielo";
    }

    @Override
    public double getCost() {
        return super.getCost()+1.5;
    }
}
