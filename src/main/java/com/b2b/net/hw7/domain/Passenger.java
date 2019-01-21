package com.b2b.net.hw7.domain;

public class Passenger {

    /**
     * NAPISZ KONSTRUKTOR INICJUJACY WSZYSTKIE POLA, GETTERY I SETTERY
     */

    private String name;
    private String surname;
    private int age;
    private Ticket ticket;
    private int noOfFlights;
    private boolean student;

    public Passenger (String name, String surname, int age, Ticket ticket, int noOfFlights, boolean student){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.ticket = ticket;
        this.noOfFlights = noOfFlights;
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getNoOfFlights() {
        return noOfFlights;
    }

    public void setNoOfFlights(int noOfFlights) {
        this.noOfFlights = noOfFlights;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }
}
