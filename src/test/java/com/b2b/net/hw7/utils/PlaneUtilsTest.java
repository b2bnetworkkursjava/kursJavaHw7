package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlaneUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Pilot pilot = new Pilot("Jan", "Kowalski", 25, 4, "junior");
    private Plane plane = new Plane(1,"Boeing 737", 190,"small",pilot, 150);
    private Ticket ticket = new Ticket(2,121, "hight", 30.0, 5, true);
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