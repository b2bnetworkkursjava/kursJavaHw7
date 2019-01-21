package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Flight;
import com.b2b.net.hw7.domain.Passenger;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */
    private Ticket ticket = new Ticket(2,121, "hight", 30.0, 5, true);
    private Passenger passenger = new Passenger("Łukasz", "Gałązka", 17, ticket, 2, false);
    private PassengerUtils passengerUtils = new PassengerUtils();

    @Test
    public void checkDiscountTest() {
        assertTrue(passengerUtils.checkDiscount(passenger, ticket));
    }
}