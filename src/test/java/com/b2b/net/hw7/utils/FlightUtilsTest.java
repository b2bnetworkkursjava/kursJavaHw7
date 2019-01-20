package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
private Ticket ticket = new Ticket(200,500.00,"ekonomiczna",0.00,30,true);
    private Pilot pilot = new Pilot("Adam", "Małysz", 35,5,"Duze samoloty");
    private Passenger passenger = new Passenger("Janusz","Andrzejewski",55,ticket,30,false);
    private Plane plane = new Plane(1000,"Tupolev",500.00,"Lot", pilot, passenger, 100);
    private Flight flight = new Flight(500,"Poland","Germany", LocalDateTime.of(2019,01,20,12,30),LocalDateTime.of(2019,01,20,15,00),600.00,plane);
    private FlightUtils flightUtils = new FlightUtils();

    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}