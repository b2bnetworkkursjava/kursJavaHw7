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
        String ticketClass=ticket.getClassType();
        double ticketPrice=ticket.getPrice();
        if (((ticketClass.equals("ekonomiczna"))&&ticketPrice<250)||(ticketClass.equals("premium")&&ticketPrice>250&&ticketPrice<400)||
                (ticketClass.equals("biznes")&&ticketPrice>400&&ticketPrice<600)||(ticketClass.equals("pierwsza")&&ticketPrice>600)){
            result=true;
        }else{
            result=false;
        }
        return result;
    }

    /**
     * 2. Uzupełnij metodę tak, aby sprawdzała czy w klasie serwują posiłek.
     * - w klasie ekonomicznej nie ma posiłku, w pozostałych tak.
     */
    public boolean checkMeal(Ticket ticket) {
        String ticketClassType=ticket.getClassType();
        boolean result;
        if (ticketClassType.equals("ekonomiczna")!=ticket.isMeal()){
            result=true;
        }else{
            result=false;
        }
        return result;
    }
}
