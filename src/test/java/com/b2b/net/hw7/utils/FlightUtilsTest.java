package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Plane plane = new Plane(1,"Boeing", 1000, "701",
            new Pilot("Roman","Szuka",36, 9, "mid"),
            new Passenger("Jan","Buc",87,
                    new Ticket(1,35.0,"ekonomiczna",30,86,false),
                    654,false),
            800);
    private Flight flight = new Flight(1,"Warsaw","Radom", LocalDateTime.MIN, LocalDateTime.MAX, 900, plane);

    private FlightUtils flightUtils = new FlightUtils();

    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}