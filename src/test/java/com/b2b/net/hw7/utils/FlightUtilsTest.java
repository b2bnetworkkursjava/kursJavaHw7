package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Pilot pilot = new Pilot("Maria", "Awaria", 40, 15,"senior");
    private Ticket ticket= new Ticket(1, 150, "eko", 30,12, true);
    private Passenger passenger= new Passenger("Jan", "Kowal", 25, ticket, 4, true);
    private Plane plane = new Plane(1,"Boing", 500,"mały", pilot, passenger, 200);
    private Flight flight = new Flight(1,"Londyn","Paryż",12, 15,300, plane );
    private FlightUtils flightUtils= new FlightUtils();


    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}