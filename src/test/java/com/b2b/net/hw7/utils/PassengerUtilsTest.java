package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Passenger;
import com.b2b.net.hw7.domain.Ticket;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Ticket ticket = new Ticket(300,150.00,"biznes",0.03,500,true);
    private Passenger passenger = new Passenger("Andrzej", "Malysz",30, ticket, 30, false);
    private PassengerUtils passengerUtils = new PassengerUtils();

    @Test
    public void checkDiscountTest() {
        assertTrue(passengerUtils.checkDiscount(passenger, ticket));
    }
}