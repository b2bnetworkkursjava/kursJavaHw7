package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import org.junit.Test;

import static org.junit.Assert.*;

public class PilotUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Pilot pilot = new Pilot("Jan", "Kowalski",50,20,"senior");
    private PilotUtils pilotUtils = new PilotUtils();

    @Test
    public void ageAndExperienceTest() {
        assertTrue(pilotUtils.ageAndExperience(pilot));
    }

    @Test
    public void checkPermissionsTest() {
        assertTrue(pilotUtils.checkPermissions(pilot));
    }
}