package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Pilot pilot = new Pilot("Jan", "Kowalski",50,20,"senior");
    private Ticket ticket = new Ticket(90,45,"ekonomiczna",50,20,true);
    private Passenger passenger = new Passenger("Magdalena", "Kot",23,ticket,2,true);
    private Plane plane = new Plane(01,"Boeing 737",5000,"mały",pilot,passenger,200);
    private Flight flight = new Flight(01,"Gdańsk","Warszawa", LocalDateTime.of(2019,01,01,01,01),LocalDateTime.of(2019,01,01,02,01),300.10,plane);
    private FlightUtils flightUtils = new FlightUtils();

    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}