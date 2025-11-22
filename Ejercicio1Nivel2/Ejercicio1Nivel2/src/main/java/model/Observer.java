package model;

import interfaces.MarketChange;

public class Observer implements MarketChange {


    private String name;
    private double notification;

    public Observer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNotification() {
        return notification;
    }

    public void setNotification(double notification) {
        this.notification = notification;
    }

    @Override
    public void update(String message, double change) {
        this.setNotification(change);
        System.out.println(this.name + message);

    }
}
