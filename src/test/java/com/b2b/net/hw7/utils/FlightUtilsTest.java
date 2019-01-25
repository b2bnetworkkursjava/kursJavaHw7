package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Ticket ticket = new Ticket(1777, 1200, "ekonomiczna", 0.025,17, false);
    private Pilot pilot = new Pilot("Jan", "Kowalski", 47, 8, "Allowed");
    private Passenger passenger = new Passenger("Meline", "Aslanyan", 29, ticket, 15, false);private Plane plane = new Plane(02, "Boeing 737", 5000, "maly", pilot, passenger, 250);
    private Flight flight = new Flight(10, "Warsaw", "Yerevan", LocalDateTime.of(2019, 01, 25, 10, 30),LocalDateTime.of(2019, 01, 25, 12, 30), 3000.00, plane );
    private FlightUtils flightUtils = new FlightUtils();

    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}