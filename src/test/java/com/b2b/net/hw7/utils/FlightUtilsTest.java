package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Pilot pilot = new Pilot("Jan", "Wiśniewski", 45, 20, "senior");
    private Ticket ticket = new Ticket(1020, 450, "biznes", 50, 39, true);
    private Passenger passenger = new Passenger("Stefan", "Majewski", 27, ticket, 5, true);
    private Plane plane = new Plane(00234, "B787", 10000, "średni", pilot, passenger, ticket, 350);
    private Flight flight = new Flight(12345, "London", "Paris", 7000, plane);
    private FlightUtils flightUtils = new FlightUtils();

    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}