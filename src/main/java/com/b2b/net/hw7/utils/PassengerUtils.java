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
        int age = passenger.getAge();
        boolean student = passenger.getStudent();
        int noOfFlights = passenger.getNoOfFlights();
        double discount = ticket.getDiscount();
        boolean bool;
        if (age < 3) {discount = 100;
            bool = true;}
        else if (age < 18 && age > 3) {discount = 30;
            bool = true;}
        else if (age > 75) {discount = 25;
            bool = true;}
        else if (student = true) {discount = 50;
            bool = true;}
        else if (noOfFlights != 0) {discount = noOfFlights * 0.001;
            bool = true;}
        else bool = false;
        System.out.println(discount);
        return bool;
    }
}