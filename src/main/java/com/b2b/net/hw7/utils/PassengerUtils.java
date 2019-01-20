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
     */
    public boolean checkDiscount(Passenger passenger, Ticket ticket) {
        boolean result;
        int wiek = passenger.getAge();
        if ( wiek < 18 || wiek > 75) {
            result = true;
        }
        else if (passenger.isStudent()){
            result = true;
        }
        else if(passenger.getNoOfFlights() * 0.001 == ticket.getDiscount()){
            result =true;
        }
else
    result = false;

        return result;
    }
}
