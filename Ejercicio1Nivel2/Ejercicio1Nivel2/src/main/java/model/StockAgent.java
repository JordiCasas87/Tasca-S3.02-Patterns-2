package model;

import java.util.ArrayList;
import java.util.List;

public class StockAgent {

    private double notification;
    private List<Observer> listObservers;

    public StockAgent() {
        listObservers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        this.listObservers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.listObservers.remove(observer);
    }

    public List<Observer> getListObservers() {
        return listObservers;
    }

    public void stockMarketUp(double increase){
        this.notification = increase;
        String message = " received notification: Stock market went UP to "+ this.notification+".";
        for (Observer observer : this.listObservers){
            observer.update(message ,this.notification);

        }

    }

    public void stockMarketDown(double decrement){
        this.notification = decrement;
        String message = " received notification: Stock market went DOWN to "+ this.notification+".";
        for (Observer observer : this.listObservers){
            observer.update(message, this.notification);

        }
    }



}
