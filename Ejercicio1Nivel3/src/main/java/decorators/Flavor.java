package decorators;

import interficies.BubbleTea;
import model.BubbleTeaDecorator;

public class Flavor extends BubbleTeaDecorator {

    private String flavor;

    public Flavor(BubbleTea decoratedBubbleTea, String flavor) {
        super(decoratedBubbleTea);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ ", sabor a "+ this.flavor;
    }

    @Override
    public double getCost() {
        return super.getCost()+3;
    }

}
