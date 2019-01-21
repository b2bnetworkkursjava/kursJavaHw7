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
        boolean result=false;
        if (ticket.getClassType().equals("eko") && ticket.getPrice()<250){
            result=true;
        }
        else if(ticket.getClassType().equals("premium") && ticket.getPrice()>=250 && ticket.getPrice()<400){
            result=true;
        }
        else if(ticket.getClassType().equals("biz") && ticket.getPrice()>=400 && ticket.getPrice()<600){
            result=true;
        }
        else if(ticket.getClassType().equals("first") && ticket.getPrice()>=600){
            result=true;
        }
        return result;
    }

    /**
     * 2. Uzupełnij metodę tak, aby sprawdzała czy w klasie serwują posiłek.
     * - w klasie ekonomicznej nie ma posiłku, w pozostałych tak.
     */
    public boolean checkMeal(Ticket ticket) {
        boolean result=false;
        if (ticket.isMeal()==false && ticket.getClassType().equals("eko")){
            result=true;
        }
        else if(ticket.isMeal()==true && ticket.getClassType().equals("premium")){
            result=true;
        }
        else if(ticket.isMeal()==true && ticket.getClassType().equals("biz")){
            result=true;
        }
        else if(ticket.isMeal()==true && ticket.getClassType().equals("first")){
            result=true;
        }
        return result;
    }
}
