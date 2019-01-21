package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Flight flight = new Flight (1, "z tamtąd", "dokąd", LocalDateTime.of(2018,12,3,12,15), LocalDateTime.of(2018,12,5,12,15), 20000, this.plane);
    private Pilot pilot = new Pilot("Adam", "Adamowicz", 75, 30, "senior");
    private Plane plane = new Plane (1, "model", 12, "typ", pilot, this.passenger, 150 );
    private Passenger passenger = new Passenger("Adam", "Adamowicz", 17, this.ticket, 40, false);
    private Ticket ticket = new Ticket(1, 240,"ekonomiczna", 30, 40, false );
    private FlightUtils flightUtils = new FlightUtils ();
    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}
