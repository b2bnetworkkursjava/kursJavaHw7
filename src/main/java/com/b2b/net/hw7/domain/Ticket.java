package com.b2b.net.hw7.domain;

public class Ticket {

    /**
     * NAPISZ KONSTRUKTOR INICJUJACY WSZYSTKIE POLA, GETTERY I SETTERY
     */

    private int ticketId;
    private double price;
    private String classType;
    private double discount;
    private int noOfSeat;
    private boolean meal;

    public Ticket (int ticketId, double price, String classType, double discount, int noOfSeat, boolean meal){
        this.ticketId = ticketId;
        this.price = price;
        this.classType = classType;
        this.discount = discount;
        this.noOfSeat = noOfSeat;
        this.meal = meal;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getNoOfSeat() {
        return noOfSeat;
    }

    public void setNoOfSeat(int noOfSeat) {
        this.noOfSeat = noOfSeat;
    }

    public boolean isMeal() {
        return meal;
    }

    public void setMeal(boolean meal) {
        this.meal = meal;
    }
}
