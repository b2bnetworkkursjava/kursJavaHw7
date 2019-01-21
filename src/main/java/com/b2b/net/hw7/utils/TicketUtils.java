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
        if (ticket.getClassType()=="ekonomiczna" && ticket.getPrice()<250) {
            result = true; }
        else if (ticket.getClassType()=="premium" && ticket.getPrice()>=250 && ticket.getPrice()<400) {
            result = true; }
        else if (ticket.getClassType()=="biznes" && ticket.getPrice()>=400 && ticket.getPrice()<600) {
            result = true; }
        else if (ticket.getClassType()=="pierwsza klasa" && ticket.getPrice()>=600) {
            result = true; }
        else {result = false;}
        return result;
    }

    /**
     * 2. Uzupełnij metodę tak, aby sprawdzała czy w klasie serwują posiłek.
     * - w klasie ekonomicznej nie ma posiłku, w pozostałych tak.
     */
    public boolean checkMeal(Ticket ticket) {
        boolean result;
        if (ticket.isMeal()==false && ticket.getClassType()=="ekonomiczna") {
            result=true;}
        else if (ticket.isMeal()==true && ticket.getClassType()!="ekonomiczna") {
            result=true;}
        else {result = false;}
                return result;
    }
}
