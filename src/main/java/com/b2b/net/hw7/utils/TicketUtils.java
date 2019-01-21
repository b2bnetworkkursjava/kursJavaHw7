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
        if (ticket.getPrice()<250 && ticket.getClassType().equals("economy")){
            return true;
        }
        else if (ticket.getPrice() >250 && ticket.getPrice() <400 && ticket.getClassType().equals("premium")){
            return true;
        }
        else if (ticket.getPrice() >450 && ticket.getPrice()<600 && ticket.getClassType().equals("Business")){
            return true;
        }
        else if (ticket.getPrice()>600 && ticket.getClassType().equals("firstClass")){
            return true;
        }
        else return false;
    }

    /**
     * 2. Uzupełnij metodę tak, aby sprawdzała czy w klasie serwują posiłek.
     * - w klasie ekonomicznej nie ma posiłku, w pozostałych tak.
     */
    public boolean checkMeal(Ticket ticket) {
        if (ticket.getClassType().equals("econome")){
            return false;
        }
        else return true;
    }
}
