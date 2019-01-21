package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;
import com.b2b.net.hw7.domain.Ticket;

public class PlaneUtils {

    /**
     * 1. Sprawdź czy model samolotu jest odpowiedniego typu
     */
    public boolean modelAndType(Plane plane) {
        boolean result;
        if (plane.getModel()== "Boeing 737" && plane.getType()=="small") {
            result = true; }
        else if (plane.getModel()== "Boeing 787" && plane.getType()=="medium") {
            result = true; }
        else if (plane.getModel()== "Airbus A380" && plane.getType()=="big") {
            result = true; }
        else {result = false;}
        return result;
    }

    /**
     * 2. Sprawdź czy liczba miejsc jest zgodna z typem samolotu.
     */
    public boolean seatsAndType(Plane plane) {
        boolean result;
        if (plane.getNoOfSeats()<200 && plane.getType()=="small") {
            result = true; }
        else if (plane.getNoOfSeats()>=200 && plane.getNoOfSeats()<350 && plane.getType()=="medium") {
            result = true; }
        else if (plane.getNoOfSeats()>=350 && plane.getNoOfSeats()<=500 && plane.getType()=="big") {
            result = true; }
        else {result = false;}
        return result;
    }

    /**
     * 3. Sprawdź czy pojemność samolotu jest zgodna z typem.
     */
    public boolean capacityAndType(Plane plane) {
        boolean result;
        if (plane.getCapacity()<5000 && plane.getType()=="small") {
            result = true; }
        else if (plane.getCapacity()>=5000 && plane.getCapacity()<10000 && plane.getType()=="medium") {
            result = true; }
        else if (plane.getCapacity()>=10000 && plane.getCapacity()<=20000 && plane.getType()=="big") {
            result = true; }
        else {result = false;}
        return result;
    }

    /**
     * 4. Sprawdź czy uprawnienia pilota zezwalają na lot samolotem danego typu.
     */
    public boolean permissionsAndType(Plane plane, Pilot pilot) {
        boolean result;
        if (pilot.getPermissions()=="junior" && plane.getType()=="small") {
            result = true; }
        else if (pilot.getPermissions()=="mid" && (plane.getType()=="medium") || plane.getType()=="small") {
            result = true; }
        else if (pilot.getPermissions()=="senior"&& (plane.getType()=="big") || plane.getType()=="medium" ||plane.getType()=="small") {
            result = true; }
        else {result = false;}
        return result;
    }

    /**
     * 5. Sprawdź czy miejsce na bilecie nie wykracza poza zakres miejsc w samolocie.
     */
    public boolean seats(Plane plane, Ticket ticket) {
        boolean result;
        result = ticket.getNoOfSeat()<=plane.getNoOfSeats()?true:false;
            return result;
    }
}
