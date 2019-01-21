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
        if (passenger.getAge() < 18 || passenger.getAge() > 75) {
            result = true;
        } else if (passenger.isStudent()) {
            result = true;
        } else if (ticket.getDiscount() > 0) {
            result = true;
        } else if (passenger.getNoOfFlights() == 0) {
            result = false;
        } else {
            result = false;
        }
        return result;
    }
}
