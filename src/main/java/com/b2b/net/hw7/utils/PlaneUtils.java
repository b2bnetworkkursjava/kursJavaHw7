package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;

public class PlaneUtils {

    /**
     * 1. Sprawdź czy model samolotu jest odpowiedniego typu.
     */
    public boolean modelAndType(Plane plane) {
        String type = plane.getType();
        String model = plane.getModel();
        boolean bool;
        if (type.equals(model)) bool = true;
        else bool = false;
        return bool;
    }

    /**
     * 2. Sprawdź czy liczba miejsc jest zgodna z typem samolotu.
     */
    public boolean seatsAndType(Plane plane) {
        int noOfSeats = plane.getNoOfSeats();
        String type = plane.getType();
        String noOfSeats1 = String.valueOf(noOfSeats);
        boolean bool;
        if (noOfSeats1.equals(type)) bool = true;
        else bool = false;
        return bool;
    }

    /**
     * 3. Sprawdź czy pojemność samolotu jest zgodna z typem.
     */
    public boolean capacityAndType(Plane plane) {
        String type = plane.getType();
        double capacity = plane.getCapacity();
        String capacity1= String.valueOf(capacity);
        boolean bool;
        if(type.equals(capacity1)) bool = true;
        else bool = false;
        return bool;
    }

    /**
     * 4. Sprawdź czy uprawnienia pilota zezwalają na lot samolotem danego typu.
     */
    public boolean permissionsAndType(Plane plane, Pilot pilot) {
        String permissions = pilot.getPermissions();
        String type = plane.getType();
        boolean bool;
        if (permissions.equals(type)) bool = true;
        else bool = false;
        return bool;
    }

    /**
     * 5. Sprawdź czy miejsce na bilecie nie wykracza poza zakres miejsc w samolocie.
     */
    public boolean seats(Plane plane, Ticket ticket) {
        int noOfSeats = plane.getNoOfSeats();
        int noOfSeat = ticket.getNoOfSeat();
        boolean bool;
        if (noOfSeat <= noOfSeats) bool = true;
        else bool = false;
        return bool;
    }
}
