package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Ticket ticket = new Ticket(11, 320, "biznes", 12,40,true);
    private Pilot pilot = new Pilot("Jacek", "Placek", 37, 10, "senior");
    private Passenger passenger = new Passenger("Tomek", "Domek", 18, ticket, 12, true);
    private Plane plane = new Plane(12, "asd", 1500, "type", pilot, passenger, 10);
    private Flight flight = new Flight(12, "Warszawa", "Kraków", LocalDateTime.of(2018,03,10,9,20), LocalDateTime.of(2018,3,12,20,36), 1200, plane);
    private FlightUtils flightUtils = new FlightUtils();

    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}