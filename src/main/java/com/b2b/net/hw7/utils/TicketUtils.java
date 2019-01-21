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
        boolean bool;
        double ticketPrice = ticket.getPrice();
        String ticketClass = ticket.getClassType();
        if ((ticketPrice < 250 && ticketClass.equals("ekonomiczna")) || ((ticketPrice > 250 && ticketPrice < 400) && ticketClass.equals("premium")) || ((ticketPrice > 400 && ticketPrice < 600) && ticketClass.equals("biznes")) || (ticketPrice > 600 && ticketClass.equals("pierwsza"))){
            bool = true;
        } else{
            bool = false;
        }
        return bool;
    }

    /**
     * 2. Uzupełnij metodę tak, aby sprawdzała czy w klasie serwują posiłek.
     * - w klasie ekonomicznej nie ma posiłku, w pozostałych tak.
     */
    public boolean checkMeal(Ticket ticket) {
        boolean bool;
        boolean meal = ticket.isMeal();
        String ticketClass = ticket.getClassType();

        if ((ticketClass.equals("ekonomiczna") && !meal) || ((ticketClass.equals("premium") || ticketClass.equals("biznes") || ticketClass.equals("pierwsza")) && meal)){
            bool = true;
        } else {
            bool = false;
        }
        return bool;
    }
}
