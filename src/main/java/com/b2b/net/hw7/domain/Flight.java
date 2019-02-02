package com.b2b.net.hw7.domain;

import java.time.LocalDateTime;

public class Flight {

    /**
     * NAPISZ KONSTRUKTOR INICJUJACY WSZYSTKIE POLA, GETTERY I SETTERY
     */

    private int flightId;
    private String from;
    private String to;
    private LocalDateTime depart;
    private LocalDateTime arrive;
    private double distance;
    private Plane plane;

    public Flight(int flightId, String from, String to, LocalDateTime depart, LocalDateTime arrive, double distance, Plane plane) {
        this.flightId = flightId;
        this.from = from;
        this.to = to;
        this.depart = depart;
        this.arrive = arrive;
        this.distance = distance;
        this.plane = plane;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setDepart(LocalDateTime depart) {
        this.depart = depart;
    }

    public void setArrive(LocalDateTime arrive) {
        this.arrive = arrive;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public int getFlightId() {
        return flightId;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDateTime getDepart() {
        return depart;
    }

    public LocalDateTime getArrive() {
        return arrive;
    }

    public double getDistance() {
        return distance;
    }

    public Plane getPlane() {
        return plane;
    }



}
