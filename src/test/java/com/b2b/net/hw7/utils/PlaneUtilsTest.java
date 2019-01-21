package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Passenger;
import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Ticket ticket = new Ticket(1312, 200.00, "ekonomiczna", 20.0, 87, false);
    private Passenger passenger = new Passenger("Adam", "Mada", 24, ticket, 13, true);
    private Pilot pilot = new Pilot("Jacek", "Placek", 45, 15, "senior");
    private Plane plane = new Plane(123, "Boeing 737", 4000, "mały", pilot, passenger, 200);
    private PlaneUtils planeUtils = new PlaneUtils();

    @Test
    public void capacityAndTypeTest() {
        assertTrue(planeUtils.capacityAndType(plane));
    }

    @Test
    public void modelAndTypeTest() {
        assertTrue(planeUtils.modelAndType(plane));
    }

    @Test
    public void permissionsAndTypeTest() {
        assertTrue(planeUtils.permissionsAndType(plane, pilot));
    }

    @Test
    public void seatsTest() {
        assertTrue(planeUtils.seats(plane, ticket));
    }

    @Test
    public void seatsAndTypeTest() {
        assertTrue(planeUtils.seatsAndType(plane));
    }
}