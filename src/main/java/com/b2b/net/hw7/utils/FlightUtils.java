package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Flight;
import com.b2b.net.hw7.domain.Plane;

public class FlightUtils {

    /**
     * 1. Sprawdź czy samolot jest w stanie dolecieć porównując dystans lotu z pojemnością samolotu.
     */
    public boolean canFly(Flight flight, Plane plane) {
        if (flight.getDistance() <= plane.getCapacity()){
            return true;
        }
        else {
            return false;
        }
    }
}
