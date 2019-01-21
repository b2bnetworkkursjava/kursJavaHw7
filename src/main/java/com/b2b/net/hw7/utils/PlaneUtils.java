package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;

public class PlaneUtils {

    /**
     * 1. Sprawdź czy model samolotu jest odpowiedniego typu.
     * Boeing 737 jest maly
     * Boeing 787 sredni
     * Airbus A380 duzy
     * pojemnosc:
     * 5000 - maly
     * 10000 - sredni
     * 20000 - duzy
     * miejsca:
     * 200 - maly
     * 350 - sredni
     * 500 - duz
     */
    public boolean modelAndType(Plane plane) {
        boolean result;
        if (plane.getModel().equals("Boeing 737") && plane.getType().equals("mały")) {
            result = true;
        } else if (plane.getModel().equals("Boeing 787") && plane.getType().equals("średni")) {
            result = true;
        } else if (plane.getModel().equals("Airbus A380") && plane.getType().equals("duży")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * 2. Sprawdź czy liczba miejsc jest zgodna z typem samolotu.
     */
    public boolean seatsAndType(Plane plane) {
        boolean result;

        if (plane.getType().equals("mały") && plane.getNoOfSeats() == 200) {
            result = true;
        } else if (plane.getType().equals("średni") && plane.getNoOfSeats() == 350) {
            result = true;
        } else if (plane.getType().equals("duży") && plane.getNoOfSeats() == 500) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * 3. Sprawdź czy pojemność samolotu jest zgodna z typem.
     */
    public boolean capacityAndType(Plane plane) {
        boolean result;

        if (plane.getType().equals("mały") && plane.getCapacity() == 5000) {
            result = true;
        } else if (plane.getType().equals("średni") && plane.getCapacity() == 10000) {
            result = true;
        } else if (plane.getType().equals("duży") && plane.getCapacity() == 20000) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * 4. Sprawdź czy uprawnienia pilota zezwalają na lot samolotem danego typu.
     */
    public boolean permissionsAndType(Plane plane, Pilot pilot) {
        boolean result;
        if (plane.getType().equals("mały") && pilot.getPermissions().equals("junior") || plane.getType().equals("mały") && pilot.getPermissions().equals("mid") || plane.getType().equals("mały") && pilot.getPermissions().equals("senior")) {
            result = true;
        } else if (plane.getType().equals("średni") && pilot.getPermissions().equals("mid") || plane.getType().equals("średni") && pilot.getPermissions().equals("senior")) {
            result = true;
        } else if (plane.getType().equals("duży") && pilot.getPermissions().equals("senior")) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * 5. Sprawdź czy miejsce na bilecie nie wykracza poza zakres miejsc w samolocie.
     */
    public boolean seats(Plane plane, Ticket ticket) {
        boolean result;
        if (plane.getType().equals("mały") && ticket.getNoOfSeat() <= 200) {
            result = true;
        } else if (plane.getType().equals("średni") && ticket.getNoOfSeat() <= 350) {
            result = true;
        } else if (plane.getType().equals("duży") && ticket.getNoOfSeat() <= 500) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
