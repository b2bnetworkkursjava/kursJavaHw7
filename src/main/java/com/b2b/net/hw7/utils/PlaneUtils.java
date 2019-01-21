package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;

public class PlaneUtils {

    /**
     * 1. Sprawdź czy model samolotu jest odpowiedniego typu.
     */
    public boolean modelAndType(Plane plane) {
        boolean result=false;
        if (plane.getModel().equals("Boeing 737") && plane.getType().equals("mały")){
            result=true;
        }
        else if(plane.getModel().equals("Boeing 787") && plane.getType().equals("średni")){
            result=true;
        }
        else if(plane.getModel().equals("Airbus A380") && plane.getType().equals("duży")){
            result=true;
        }
        return result;
    }

    /**
     * 2. Sprawdź czy liczba miejsc jest zgodna z typem samolotu.
     */
    public boolean seatsAndType(Plane plane) {
        boolean result=false;
        if (plane.getNoOfSeats()<200 && plane.getType().equals("mały")){
            result=true;
        }
        else if(plane.getNoOfSeats()>=200 && plane.getNoOfSeats()<350 && plane.getType().equals("średni")){
            result=true;
        }
        else if(plane.getNoOfSeats()>=350 && plane.getType().equals("duży")){
            result=true;
        }
        return result;
    }

    /**
     * 3. Sprawdź czy pojemność samolotu jest zgodna z typem.
     */
    public boolean capacityAndType(Plane plane) {
        boolean result=false;
        if (plane.getCapacity()<5000 && plane.getType().equals("mały")){
            result=true;
        }
        else if(plane.getCapacity()>=5000 && plane.getCapacity()<1000 && plane.getType().equals("średni")){
            result=true;
        }
        else if(plane.getCapacity()>=2000 && plane.getType().equals("duży")){
            result=true;
        }
        return result;
    }

    /**
     * 4. Sprawdź czy uprawnienia pilota zezwalają na lot samolotem danego typu.
     */
    public boolean permissionsAndType(Plane plane, Pilot pilot) {
        boolean result=false;
        if (plane.getPilot().getPermissions().equals("junior") && plane.getType().equals("mały")){
            result=true;
        }
        else if(plane.getPilot().getPermissions().equals("mid") && (plane.getType().equals("średni")||plane.getType().equals("mały"))){
            result=true;
        }
        else if(plane.getPilot().getPermissions().equals("senior")&& (plane.getType().equals("duży")||plane.getType().equals("mały")||plane.getType().equals("średni"))){
            result=true;
        }
        return result;
    }

    /**
     * 5. Sprawdź czy miejsce na bilecie nie wykracza poza zakres miejsc w samolocie.
     */
    public boolean seats(Plane plane, Ticket ticket) {
        boolean result=false;
        if (plane.getNoOfSeats()>=ticket.getNoOfSeat()){
            result=true;
        }
        return result;
    }
}
