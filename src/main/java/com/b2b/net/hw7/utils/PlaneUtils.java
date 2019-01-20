package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;

public class PlaneUtils {

    /**
     * 1. Sprawdź czy model samolotu jest odpowiedniego typu.
     */
    public boolean modelAndType(Plane plane) {
        if (plane.getModel().equals("Tupolev") && plane.getType().equals("Pasa")) {
            return true;
        }
        return false;
    }

    /**
     * 2. Sprawdź czy liczba miejsc jest zgodna z typem samolotu.
     */
    public boolean seatsAndType(Plane plane) {
        if (plane.getType().equals("Pasa") && plane.getNoOfSeats() == 105) {
            return true;

        }
        return false;
    }

    /**
     * 3. Sprawdź czy pojemność samolotu jest zgodna z typem.
     */
    public boolean capacityAndType(Plane plane) {
        if (plane.getCapacity() == 100 && plane.getType().equals("Pasa")) {
            return true;
        }
        return false;
    }

    /**
     * 4. Sprawdź czy uprawnienia pilota zezwalają na lot samolotem danego typu.
     */
    public boolean permissionsAndType(Plane plane, Pilot pilot) {
        if (plane.getPilot().getPermissions().equals("Pasa") && plane.getType().equals("Pasa")) {
            return true;
        }
        return false;
    }

    /**
     * 5. Sprawdź czy miejsce na bilecie nie wykracza poza zakres miejsc w samolocie.
     */
    public boolean seats(Plane plane, Ticket ticket) {
        if (ticket.getNoOfSeat() < plane.getNoOfSeats()) {
            return true;
        }
        return false;
    }
}

