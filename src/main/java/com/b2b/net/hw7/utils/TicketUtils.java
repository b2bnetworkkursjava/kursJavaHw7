package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Ticket;

public class TicketUtils {

    /**
     * 1. Uzupełnij metodę tak, aby sprawdzała czy cena biletu odpowiada klasie.
     * - klasa ekonomiczna cena<250
     * - klasa premium 400>cena>250
     * - klasa biznes 600>cena>450
     * - pierwsza klasa cena>600
     */
    public boolean checkClass(Ticket ticket) {
        boolean result;
        String klasa = ticket.getClassType();
        double cena = ticket.getPrice();
        if(klasa.equals("ekonomiczna") && cena < 250){
            result = true;
        }
        else if(klasa.equals("premium") && (cena > 250 && cena < 400)){
            result = true;
        }
        else if(klasa.equals("biznes") && (cena > 450 && cena < 600)) {
            result = true;
        }
        else if(klasa.equals("pierwsza") && cena > 600 ) {
            result = true;
        }
        else
            result = false;
        return result;
    }

    /**
     * 2. Uzupełnij metodę tak, aby sprawdzała czy w klasie serwują posiłek.
     * - w klasie ekonomicznej nie ma posiłku, w pozostałych tak.
     */
    public boolean checkMeal(Ticket ticket) {
        boolean result;
        if(ticket.getClassType().equals("ekonomiczna")){
            result = false;
        }
        else
            result = true;
        return result;
    }
}
