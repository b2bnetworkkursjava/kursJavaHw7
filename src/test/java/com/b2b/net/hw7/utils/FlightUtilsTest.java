package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */


    private Plane plane = new Plane(90,"Boing", 100,"Szybowiec",this.pilot,this.passenger,20);
    private Passenger passenger = new Passenger("Wojciech","malecki",19,this.ticket,20,true);
    private Pilot pilot = new Pilot("Jan","Kowalski",56,30,"20");
    private Ticket ticket = new Ticket(11,600,"Pierwsza",1000,40,false);
    private Flight flight = new Flight(12,"Poland","London", LocalDateTime.MIN,LocalDateTime.MAX,700,this.plane);
    private FlightUtils flightUtils = new FlightUtils();


    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}