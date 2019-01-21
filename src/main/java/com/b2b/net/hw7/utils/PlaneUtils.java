package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;

public class PlaneUtils {
    /**
     * możemy mieć mały, średni i duży typ samolotu
     * junior, mid i senior moga pilotowac odpowiednio maly, sredni i duzy samolot
     * i to dziala wstecz, czyli mid moze latac srednimi i malymi samolotami, a senior kazdym typem
     * jezeli chodzi o pojemnosc i miejsca:
     * pojemnosc:
     * 5000 - maly
     * 10000 - sredni
     * 20000 - duzy
     * miejsca:
     * 200 - maly
     * 350 - sredni
     * 500 - duzy
     * i mamy trzy modele:
     * Boeing 737 jest maly
     * Boeing 787 sredni
     * Airbus A380 duzy
     */
    /**
     * 1. Sprawdź czy model samolotu jest odpowiedniego typu.
     */
    public boolean modelAndType(Plane plane) {
        boolean bool;
        if ((plane.getType().equals("mały") && plane.getModel().equals("Boeing 737")) || (plane.getType().equals("średni") && plane.getModel().equals("Boeing 787")) || (plane.getType().equals("duży") && plane.getModel().equals("Airbus A380"))){
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    /**
     * 2. Sprawdź czy liczba miejsc jest zgodna z typem samolotu.
     */
    public boolean seatsAndType(Plane plane) {
        boolean bool;
        if ((plane.getNoOfSeats() == 200 && plane.getType().equals("mały")) || (plane.getNoOfSeats() == 350 && plane.getType().equals("średni")) || (plane.getNoOfSeats() == 500 && plane.getType().equals("duży"))){
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    /**
     * 3. Sprawdź czy pojemność samolotu jest zgodna z typem.
     */
    public boolean capacityAndType(Plane plane) {
        boolean bool;
        if ((plane.getCapacity() < 5000 && plane.getType().equals("mały")) || ((plane.getCapacity() > 5000 && plane.getCapacity() < 20000) && plane.getType().equals("średni")) || (plane.getCapacity() > 20000 && plane.getType().equals("duży"))){
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }

    /**
     * 4. Sprawdź czy uprawnienia pilota zezwalają na lot samolotem danego typu.
     */
    public boolean permissionsAndType(Plane plane, Pilot pilot) {
        String pilotPermission = pilot.getPermissions();
        String planeType = plane.getType();
        boolean bool;

        if ((pilotPermission.equals("junior") && planeType.equals("mały")) || (pilotPermission.equals("mid") && (planeType.equals("mały") || planeType.equals("średni"))) || (pilotPermission.equals("senior") && (planeType.equals("mały") || planeType.equals("średni") || planeType.equals("duży")))){
            bool = true;
        } else {
            bool = false;
        }

        return bool;
    }

    /**
     * 5. Sprawdź czy miejsce na bilecie nie wykracza poza zakres miejsc w samolocie.
     */
    public boolean seats(Plane plane, Ticket ticket) {
        boolean bool;
        if (plane.getNoOfSeats() > ticket.getNoOfSeat()){
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
}
