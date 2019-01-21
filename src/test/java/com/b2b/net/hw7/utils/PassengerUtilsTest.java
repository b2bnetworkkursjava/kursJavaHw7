package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Passenger;
import com.b2b.net.hw7.domain.Ticket;
import org.junit.Test;

import static org.junit.Assert.*;

public class PassengerUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Passenger passenger = new Passenger("Ola","Jak",25,
            new Ticket(19,50.0,"Ekonomiczna",2,2,false),3,true);
    private Ticket ticket = new Ticket(1,45.0,"ekonomiczna",40,7,false);
    private PassengerUtils passengerUtils =new PassengerUtils();

    @Test
    public void checkDiscountTest() {
        assertTrue(passengerUtils.checkDiscount(passenger, ticket));
    }
}