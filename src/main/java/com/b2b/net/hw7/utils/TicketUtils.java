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
        boolean result = false;
        if (ticket.getPrice() < 250 && ticket.getClassType().equals("ekonomiczna")) {
            result = true;
        } else if (ticket.getPrice() >= 250 && ticket.getPrice() < 400 && ticket.getClassType().equals("premium")) {
            result = true;
        } else if (ticket.getPrice() >= 400 && ticket.getPrice() < 600 && ticket.getClassType().equals("biznes")) {
            result = true;
        } else if (ticket.getPrice() >= 600 && ticket.getClassType().equals("pierwsza")) {
            result = true;
        }
        return result;
    }

    /**
     * 2. Uzupełnij metodę tak, aby sprawdzała czy w klasie serwują posiłek.
     * - w klasie ekonomicznej nie ma posiłku, w pozostałych tak.
     */
    public boolean checkMeal1(Ticket ticket) {
        boolean result = false;
        if (ticket.getClassType().equals("ekonomiczna") && ticket.isMeal() == false) {
            result = true;
        } else if (ticket.getClassType().equals("premium") && ticket.isMeal() == true) {
            result = true;
        } else if (ticket.getClassType().equals("biznes") && ticket.isMeal() == true) {
            result = true;
        } else if (ticket.getClassType().equals("pierwsza") && ticket.isMeal() == true) {
            result = true;
        }
        return result;
    }

    public boolean checkMeal(Ticket ticket) {
        boolean result = false;
        if (ticket.getClassType().equals("ekonomiczna") && ticket.isMeal() == false) {
            result = true;
        } else if (!ticket.getClassType().equals("ekonomiczna") && ticket.isMeal() == true) {
            result = true;
        }
        return result;
    }
}
