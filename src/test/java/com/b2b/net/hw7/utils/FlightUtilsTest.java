package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Flight;
import com.b2b.net.hw7.domain.Plane;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Flight flight;
    private Plane plane;
    private FlightUtils flightUtils;

    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}