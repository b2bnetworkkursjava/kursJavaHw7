package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Passenger;
import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Pilot pilot = new Pilot("Jan", "Kowalski", 47, 8, "Allowed");
    private Ticket ticket = new Ticket(1777, 1200, "ekonomiczna", 0.025,17, false);
    private Passenger passenger = new Passenger("Meline", "Aslanyan", 29, ticket, 15, false);
    private Plane plane = new Plane(21, "Boeing 737", 5000.00, "maly", pilot, passenger, 200);
    private PilotUtils pilotUtils = new PilotUtils();


    @Test
    public void ageAndExperienceTest() {
        assertTrue(pilotUtils.ageAndExperience(pilot));
    }

    @Test
    public void checkPermissionsTest() {
        assertTrue(pilotUtils.checkPermissions(pilot, plane));
    }
}