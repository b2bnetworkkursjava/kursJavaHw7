package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;

public class PlaneUtils {

    /**
     * 1. Sprawdź czy model samolotu jest odpowiedniego typu.
     */
    public boolean modelAndType(Plane plane) {
        boolean result;
        if ((plane.getModel().equals("Boeing") && plane.getType().equals("701")) || (plane.getModel().equals("Boeing") && plane.getType().equals("2702"))) {
            result = true;
        } else if ((plane.getModel().equals("Airbus") && plane.getType().equals("901")) || (plane.getModel().equals("Airbus") && plane.getType().equals("902"))) {
            result = true;
        } else
            result = false;
        return result;
    }

    /**
     * 2. Sprawdź czy liczba miejsc jest zgodna z typem samolotu.
     */
    public boolean seatsAndType(Plane plane) {
        boolean result;
        String typ = plane.getType();
        {
            if (typ.equals("701") && (plane.getNoOfSeats() <= 800)) {
                result = true;
            }
            else if (typ.equals("702") && (plane.getNoOfSeats() <= 900)) {
                result = true;
            }
            else if (typ.equals("901") && (plane.getNoOfSeats() <= 800)) {
                result = true;
            }
            else if (typ.equals("902") && (plane.getNoOfSeats() <= 900)) {
                result = true;
            } else
                result = false;
            return result;
        }
    }

    /**
     * 3. Sprawdź czy pojemność samolotu jest zgodna z typem.
     */
    public boolean capacityAndType(Plane plane) {
        boolean result;
        String typ = plane.getType();
        double pojemnosc = plane.getCapacity();
        if (pojemnosc == 1000.0 && typ.equals("701")) {
            result = true;
        } else if (pojemnosc == 2000.0 && typ.equals("702")) {
            result = true;

        } else if (pojemnosc == 3000.0 && typ.equals("901")) {
            result = true;

        } else if (pojemnosc == 4000.0 && typ.equals("902")) {
            result = true;

        } else
            result = false;
        return result;
    }


    /**
     * 4. Sprawdź czy uprawnienia pilota zezwalają na lot samolotem danego typu.
     */
    public boolean permissionsAndType(Plane plane, Pilot pilot) {
        boolean result;
        String typ = plane.getType();
        String uprawnienia = pilot.getPermissions();
        if(typ.equals("702") && uprawnienia.equals("junior")){
            result = true;
        }
        else  if(typ.equals("701") && uprawnienia.equals("mid")){
            result = true;
        }
        else  if(typ.equals("901") && uprawnienia.equals("senior")) {
            result = true;
        }
        else  if(typ.equals("902") && uprawnienia.equals("senior")) {
            result = true;
        }
        else
            result = false;
        return result;
    }

    /**
     * 5. Sprawdź czy miejsce na bilecie nie wykracza poza zakres miejsc w samolocie.
     */
    public boolean seats(Plane plane, Ticket ticket) {
        boolean result;
        int miejsce = ticket.getNoOfSeat();
        int zakres_miejsc = plane.getNoOfSeats();
        if(miejsce < zakres_miejsc){
            result = true;
        }
        else
            result = false;
        return result;
    }
}
