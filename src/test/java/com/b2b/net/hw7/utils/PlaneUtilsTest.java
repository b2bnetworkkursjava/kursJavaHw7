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

    private Plane plane = new Plane(2,"400",400,"50",this.pilot,this.passenger,4);
    private Passenger passenger = new Passenger("Adam","Byka",40,this.ticket,4,false);
    private Pilot pilot = new Pilot("Jan","Chmiel",70,50,"200");
    private Ticket ticket = new Ticket(40,200,"PIerwsza",140,5,false);
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