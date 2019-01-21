package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;

public class PlaneUtils {

    /**
     * możemy mieć mały, średni i duży typ samolotu
     * junior, mid i senior moga pilotowac odpowiednio maly, sredni i duzy samolot
     * i to dziala wstecz, czyli mid moze latac srednimi i malymi samolotami, a senior kazdym typem
     * jezeli chodzi o pojemnosc i miejsca
     * pojemnosc:
     * 5000 - maly
     * 10000 - sredni
     * 20000 - duzy
     * miejsca:
     * 200 - maly
     * 350 - sredni
     * 500 - duzy
     * i mamy trzy modele
     * Boeing 737 jest maly
     * Boeing 787 sredni
     * Airbus A380 duzy
     * 1. Sprawdź czy model samolotu jest odpowiedniego typu.
     */
    public boolean modelAndType(Plane plane) {
        boolean result = false;
        if (plane.getModel().equals("B737") && plane.getType().equals("mały")) {
            result = true;
        } else if (plane.getModel().equals("B787") && plane.getType().equals("średni")) {
            result = true;
        } else if (plane.getModel().equals("A380") && plane.getType().equals("duży")) {
            result = true;
        }
        return result;
    }

    /**
     * 2. Sprawdź czy liczba miejsc jest zgodna z typem samolotu.
     */
    public boolean seatsAndType(Plane plane) {
        boolean result = false;
        if (plane.getNoOfSeats() == 200 && plane.getType().equals("mały")) {
            result = true;
        } else if (plane.getNoOfSeats() == 350 && plane.getType().equals("średni")) {
            result = true;
        } else if (plane.getNoOfSeats() == 500 && plane.getType().equals("duży")) {
            result = true;
        }
        return result;
    }

    /**
     * 3. Sprawdź czy pojemność samolotu jest zgodna z typem.
     */
    public boolean capacityAndType(Plane plane) {
        boolean result = false;
        if (plane.getCapacity() == 5000 && plane.getType().equals("mały")) {
            result = true;
        } else if (plane.getCapacity() == 10000 && plane.getType().equals("średni")) {
            result = true;
        } else if (plane.getCapacity() == 20000 && plane.getType().equals("duży")) {
            result = true;
        }
        return result;
    }

    /**
     * 4. Sprawdź czy uprawnienia pilota zezwalają na lot samolotem danego typu.
     */
    public boolean permissionsAndType(Plane plane, Pilot pilot) {
        boolean result = false;
        if (plane.getPilot().getPermissions().equals("junior") && plane.getType().equals("mały")) {
            result = true;
        } else if (plane.getPilot().getPermissions().equals("mid") && plane.getType().matches("mały|średni")) {
            result = true;
        } else if (plane.getPilot().getPermissions().equals("senior") && plane.getType().matches("mały|średni|duży")) {
            result = true;
        }
        return result;
    }

    /**
     * 5. Sprawdź czy miejsce na bilecie nie wykracza poza zakres miejsc w samolocie.
     */
    public boolean seats(Plane plane, Ticket ticket) {
        boolean result = false;
        if (plane.getTicket().getNoOfSeat() <= plane.getNoOfSeats()) {
            result = true;
        }
        return result;
    }
}
