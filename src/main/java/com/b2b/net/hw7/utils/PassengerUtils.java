package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Passenger;
import com.b2b.net.hw7.domain.Ticket;

public class PassengerUtils {

    /**
     * 1. Uzupełnij metodę tak, aby sprawdzała czy klientowi przysługuje zniżka.
     * - wiek < 3 100% zniżki;
     * - 18 > wiek > 3 30% zniżki;
     * - wiek > 75 25% zniżki;
     * - student 50% zniżki;
     * - noOfFlights * 0,001 o ile nie przysługuje żadna z powyższych
     * ########## podejrzewam, ze autor mial na mysli inna tresc np: sprawdz czy znizka zostala prawdlowo naliczona?
     */
    public boolean checkDiscount(Passenger passenger, Ticket ticket) {
        boolean result;
        if( (passenger.getAge()<3) && (ticket.getDiscount()==100) ) {
            result=true;
        } else if ((passenger.getAge()<18) &&(passenger.getAge()>=3) && (ticket.getDiscount()==30)) {
            result=true;
        } else if ((passenger.getAge()>75) && (ticket.getDiscount()==25)) {
            result=true;
        } else if ((passenger.isStudent()==true) && (ticket.getDiscount()==50)) {
            result=true;
        } else if (ticket.getDiscount()== passenger.getNoOfFlights()*0.001) {
            result=true;
        }
        else {
            result=false;
        }
        return result;
            }
}
