package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Passenger;
import com.b2b.net.hw7.domain.Ticket;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Ticket ticket= new Ticket(1, 150, "eko", 30,12, true);
    private Passenger passenger= new Passenger("Jan", "Kowal", 25, ticket, 4, true);
    private PassengerUtils passengerUtils= new PassengerUtils();

    @Test
    public void checkDiscountTest() {
        assertTrue(passengerUtils.checkDiscount(passenger, ticket));
    }
}