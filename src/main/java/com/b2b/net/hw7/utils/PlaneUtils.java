package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;

public class PlaneUtils {

    /**
     * 1. Sprawdź czy model samolotu jest odpowiedniego typu.
     */
    public boolean modelAndType(Plane plane) {
        if ((plane.getModel() == "Boeing 737" && plane.getType() == "maly") ||
                (plane.getModel() == "Boeing 787" && plane.getType() == "sredni") ||
                (plane.getModel() == "Airbus A380" && plane.getType() == "duzy")
        )
        return true;
        else {
            return false;
        }
    }

    /**
     * 2. Sprawdź czy liczba miejsc jest zgodna z typem samolotu.
     */
    public boolean seatsAndType(Plane plane) {
        if ((plane.getNoOfSeats() == 200 && plane.getType() == "maly") ||
                (plane.getNoOfSeats() == 350 && plane.getType() == "sredni") ||
                (plane.getNoOfSeats() == 500 && plane.getType() == "duzy")
        )
        return true;
        else {
            return false;
        }
    }

    /**
     * 3. Sprawdź czy pojemność samolotu jest zgodna z typem.
     */
    public boolean capacityAndType(Plane plane) {
        if ((plane.getCapacity() == 5000.00 && plane.getType() == "maly") ||
                (plane.getCapacity() == 10000.00 && plane.getType() == "sredni") ||
                (plane.getCapacity() == 20000.00 && plane.getType() == "duzy")
        )
            return true;
        else {
            return false;
        }

    }

    /**
     * 4. Sprawdź czy uprawnienia pilota zezwalają na lot samolotem danego typu.
     */
    public boolean permissionsAndType(Plane plane, Pilot pilot) {
        if ((pilot.getExperience() < 5 && plane.getType() == "maly" && pilot.getPermissions() == "Allowed") ||
                (pilot.getExperience() < 5 && (plane.getType() == "sredni" || plane.getType() == "duzy") && pilot.getPermissions() == "Not Allowed") ||
                ((pilot.getExperience() > 5 && pilot.getExperience() < 10) &&
                        (plane.getType() == "maly" || plane.getType() == "sredni") && pilot.getPermissions() == "Allowed") ||
                        ((pilot.getExperience() > 5 && pilot.getExperience() < 10) &&
                                (plane.getType() == "duzy" ) && pilot.getPermissions() == "Now Allowed") ||
                (pilot.getExperience() > 10 &&
                        (plane.getType() == "maly" ||
                                plane.getType() == "sredni" ||
                                plane.getType() == "duzy"))
        ) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 5. Sprawdź czy miejsce na bilecie nie wykracza poza zakres miejsc w samolocie.
     */
    public boolean seats(Plane plane, Ticket ticket) {
        if (plane.getNoOfSeats() >= ticket.getNoOfSeat()) {
            return true;
        }
        else {
            return false;
        }
    }

}
