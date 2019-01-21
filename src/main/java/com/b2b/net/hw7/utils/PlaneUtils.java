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
        boolean result;
        if (type.equals(model)) result = true;
        else result = false;
        return result;
    }

    /**
     * 2. Sprawdź czy liczba miejsc jest zgodna z typem samolotu.
     */
    public boolean seatsAndType(Plane plane) {
        int noOfSeats = plane.getNoOfSeats();
        String type = plane.getType();
        String noOfseats1 = String.valueOf(noOfSeats);
        boolean result;
        if (noOfseats1.equals(type)) result =true;
        else result = false;
        return result;
    }

    /**
     * 3. Sprawdź czy pojemność samolotu jest zgodna z typem.
     */
    public boolean capacityAndType(Plane plane) {

        double capcity = plane.getCapacity();
        String type = plane.getType();
        boolean result;
        if (type.equals(capcity))
            result = true;
        else result = false;
        return result;
    }

    /**
     * 4. Sprawdź czy uprawnienia pilota zezwalają na lot samolotem danego typu.
     */
    public boolean permissionsAndType(Plane plane, Pilot pilot) {
        String permissions = pilot.getPermissions();
        String type = plane.getType();
        boolean result;
        if (permissions.equals(type))
            result = true;
                    else  result = false;
                    return result;

    }

    /**
     * 5. Sprawdź czy miejsce na bilecie nie wykracza poza zakres miejsc w samolocie.
     */
    public boolean seats(Plane plane, Ticket ticket) {
        int noOfSeats = plane.getNoOfSeats();
        int noOfSeat = ticket.getNoOfSeat();
        boolean resolt;
        if (noOfSeat <= noOfSeats)
            resolt = true;
        else resolt = false;
        return resolt;

    }
}
