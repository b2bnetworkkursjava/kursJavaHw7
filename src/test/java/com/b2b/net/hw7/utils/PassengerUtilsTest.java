package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Passenger;
import com.b2b.net.hw7.domain.Ticket;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Ticket ticket = new Ticket(90, 45, "ekonomiczna", 50, 20, true);
    private Passenger passenger = new Passenger("Magdalena", "Kot", 23, ticket, 2, true);
    private PassengerUtils passengerUtils = new PassengerUtils();

    @Test
    public void checkDiscountTest() {
        assertTrue(passengerUtils.checkDiscount(passenger, ticket));
    }
}