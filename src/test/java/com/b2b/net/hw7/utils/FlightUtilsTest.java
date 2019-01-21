package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Flight;
import com.b2b.net.hw7.domain.Passenger;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Plane plane = new Plane(1200);
    private Flight flight=new Flight(1,"Warszawa", "Dubaj", 1200, plane);
    FlightUtils flightUtils= new FlightUtils();
   // Ticket ticket = new Ticket(1,120, "hight", 50, 43,true);
    // Passenger passenger = new Passenger("Łukasz", "Gałązka", 30, ticket, 12, true);


    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}