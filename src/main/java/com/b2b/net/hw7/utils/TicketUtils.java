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
        double price = ticket.getPrice();
        String classType = ticket.getClassType();
        boolean bool;
        if (price < 250) { classType = "ekonomiczna";
        bool = true; }
        else if (price < 400 && price > 250) { classType = "premium";
        bool = true; }
        else if (price < 600 && price < 450) { classType = "biznes";
        bool = true;}
        else if (price > 600) {classType = "pierwsza";
        bool = true;}
        else bool = false;
        System.out.println(classType);
        return bool;
    }

    /**
     * 2. Uzupełnij metodę tak, aby sprawdzała czy w klasie serwują posiłek.
     * - w klasie ekonomicznej nie ma posiłku, w pozostałych tak.
     */
    public boolean checkMeal(Ticket ticket) {
        String classType = ticket.getClassType();
        boolean bool;
        if (classType.equals("ekonomiczna")) bool = false;
        else bool = true;
        return bool;
    }
}
