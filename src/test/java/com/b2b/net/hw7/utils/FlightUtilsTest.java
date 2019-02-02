package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.*;
import org.junit.Test;

import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class FlightUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Ticket ticket = new Ticket(12, 500, "biznes", 30, 500, true);
    private Pilot pilot=new Pilot("Endriu","Golota",57,23,"senior");
    private Passenger passenger=new Passenger("Krzychu","Jarzyna",17,ticket,1,true);
    private Plane plane = new Plane(796, "Airbus A380", 1000, "duzy",pilot,passenger,212);
    private Flight flight = new Flight(1452, "Warsaw", "Londyn", LocalDateTime.of(2018, 03, 12, 12, 15), LocalDateTime.of(2018, 3, 12, 15, 33, 25, 25), 1152, plane);
    private FlightUtils flightUtils=new FlightUtils();

    @Test
    public void canFlyTest() {
        assertTrue(flightUtils.canFly(flight, plane));
    }
}