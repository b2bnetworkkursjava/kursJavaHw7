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
    private Ticket ticket = new Ticket(997,200.00,"biznes",0.00,50,true);
    private Passenger passenger = new Passenger("Janusz", "Tracz", 40, ticket,20,false);
    private Pilot pilot = new Pilot("Andrzej", "Malysz",50, 20, "Pasa");
    private Plane plane = new Plane(500,"Tupolev", 100,"Pasa", pilot,passenger, 105);
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