package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    LocalDateTime dep = LocalDateTime.of(2019,01, 29, 11, 00);
    LocalDateTime arr = LocalDateTime.of(2019,01,29,12,30);
    private Ticket ticket = new Ticket(4852, 300, "premium", 00.00, 102, true);
    private Passenger passenger = new Passenger("Ada","Maj", 38, ticket, 4, false);
    private Pilot pilot = new Pilot("Adam", "Flaj", 48, 25, "senior");
    private Plane plane = new Plane(250,"Boeing 787", 10000, "medium", pilot,passenger,289);
    private Flight flight = new Flight(1,"Warsaw",  "Roma", dep,arr,2500, plane);

    private FlightUtils flightUtils = new FlightUtils();

    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}

