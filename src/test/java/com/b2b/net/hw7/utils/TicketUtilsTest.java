package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Ticket;
import org.junit.Test;

import static org.junit.Assert.*;

public class TicketUtilsTest {

    /**
     * ZAINICJUJ OBIEKTY WYKORZYSTUJAC KONSTRUKTORY UTWORZONE W KLASACH. PAMIETAJ O POPRAWNOSCI DANYCH INACZEJ TESTY NIE PRZEJDA.
     */

    private Ticket ticket=new Ticket(254,230,"ekonomiczna",0,400,false);
    private TicketUtils ticketUtils=new TicketUtils();

    @Test
    public void checkClassTest() {
        assertTrue(ticketUtils.checkClass(ticket));
    }

    @Test
    public void checkMealTest() {
        assertTrue(ticketUtils.checkMeal(ticket));
    }
}