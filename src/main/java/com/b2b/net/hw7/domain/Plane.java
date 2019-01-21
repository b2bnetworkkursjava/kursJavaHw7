package com.b2b.net.hw7.domain;

public class Plane {

    /**
     * NAPISZ KONSTRUKTOR INICJUJACY WSZYSTKIE POLA, GETTERY I SETTERY
     */

    private int planeId;
    private String model;
    private double capacity;
    private String type;
    private Pilot pilot;
    private Passenger passenger;
    private int noOfSeats;

    public Plane(int planeId, String model, double capacity, String type, Pilot pilot, int noOfSeats) {
        this.planeId = planeId;
        this.model = model;
        this.capacity = capacity;
        this.type = type;
        this.pilot = pilot;
        this.passenger = passenger;
        this.noOfSeats = noOfSeats;
    }

    public Plane(double capacity) {
        this.capacity=capacity;
    }


    public int getPlaneId() {
        return planeId;
    }

    public void setPlaneId(int planeId) {
        this.planeId = planeId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}
