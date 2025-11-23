package decorators;

import interficies.BubbleTea;
import model.BubbleTeaDecorator;

public class Sugar extends BubbleTeaDecorator {

    public Sugar(BubbleTea decoratedBubbleTea) {
        super(decoratedBubbleTea);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", bomba de azucar extra-diabeética";
    }

    @Override
    public double getCost() {
        return super.getCost()+2;
    }


}
