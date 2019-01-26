package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Flight flight = new Flight (3, "z Polski", "Niemiwc", LocalDateTime.of(2019,01,20,5,13), LocalDateTime.of(2019,01,20,5,13), 300, this.plane);
    private Pilot pilot = new Pilot("Jan", "Kowalski", 50, 25, "senior");
    private Plane plane = new Plane (2, "Boeing", 200, "787", pilot, this.passenger, 200 );
    private Passenger passenger = new Passenger("Marian", "Januszewicz", 30, this.ticket, 20, false);
    private Ticket ticket = new Ticket(5, 200,"ekonomiczna", 50, 100, false );
    private FlightUtils flightUtils = new FlightUtils ();

    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}