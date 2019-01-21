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
        boolean result = false;
        if (passenger.getAge() < 3 && passenger.getTicket().getDiscount() == 100) {
            result = true;
        } else if (passenger.getAge() >= 3 && passenger.getAge() < 18 && passenger.getTicket().getDiscount() == 30) {
            result = true;
        } else if (passenger.getAge() > 75 && passenger.getTicket().getDiscount() == 25) {
            result = true;
        } else if (passenger.isStudent() == true && passenger.getTicket().getDiscount() == 50) {
            result = true;
        } else if (passenger.getTicket().getDiscount() == passenger.getNoOfFlights() * 0.001) {
            result = true;
        }
        return result;
    }
}
