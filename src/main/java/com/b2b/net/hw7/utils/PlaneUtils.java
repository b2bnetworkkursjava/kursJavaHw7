package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;

public class PlaneUtils {

    /**
     * 1. Sprawdź czy model samolotu jest odpowiedniego typu.
     *
     * 5000 - maly
     * 10000 - sredni
     * 20000 - duzy
     * miejsca:
     * 200 - maly
     * 350 - sredni
     * 500 - duzy
     *
     * i mamy trzy modele
     * Boeing 737 jest maly
     * Boeing 787 sredni
     * Airbus A380 duzy
     */

    public boolean modelAndType(Plane plane) {
        if (plane.getModel().equals("Boeing 737") && plane.getType().equals("small")){
            return true;
        }
        else if (plane.getModel().equals("Boeing 787") && plane.getType().equals("medium")){
            return true;
        }
        else if (plane.getModel().equals("Airbus A380") && plane.getType().equals("big")){
            return true;
        }
        else return false;
    }

    /**
     * 2. Sprawdź czy liczba miejsc jest zgodna z typem samolotu.
     */
    public boolean seatsAndType(Plane plane) {
        if (plane.getType().equals("small") && plane.getNoOfSeats()<201){
            return true;
        }
        else if (plane.getType().equals("medium")&& plane.getNoOfSeats()>200 && plane.getNoOfSeats()<351){
            return true;
        }
        else if (plane.getType().equals("big")&& plane.getNoOfSeats() >350 && plane.getNoOfSeats() <501){
            return true;
        }
        else return false;
    }

    /**
     * 3. Sprawdź czy pojemność samolotu jest zgodna z typem.
     */
    public boolean capacityAndType(Plane plane) {
        if (plane.getCapacity()<5001.00 && plane.getType().equals("small")){
            return true;
        }
        else if (plane.getCapacity()>5000.00 && plane.getCapacity()<10001.00 && plane.getType().equals("medium")){
            return true;
        }
        else if (plane.getCapacity()>10000.00 && plane.getCapacity()<20001.00 && plane.getType().equals("big")){
            return true;
        }
        else return false;
    }

    /**
     * 4. Sprawdź czy uprawnienia pilota zezwalają na lot samolotem danego typu.
     */
    public boolean permissionsAndType(Plane plane, Pilot pilot) {
        if (pilot.getPermissions().equals("junior") && plane.getType().equals("small")){
            return true;
        }
        else if (pilot.getPermissions().equals("mid")&&plane.getType().equals("small")&&plane.getType().equals("medium")){
            return true;
        }
        else if (pilot.getPermissions().equals("senior")&&(plane.getType().equals("small")||plane.getType().equals("medium")||plane.getType().equals("big"))){
            return true;
        }
        else return false;
    }

    /**
     * 5. Sprawdź czy miejsce na bilecie nie wykracza poza zakres miejsc w samolocie.
     */
    public boolean seats(Plane plane, Ticket ticket) {
        if (ticket.getNoOfSeat() <= plane.getNoOfSeats()){
            return true;
        }
        else return false;
    }
}
