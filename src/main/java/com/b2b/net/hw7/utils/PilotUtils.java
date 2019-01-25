package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;
import com.b2b.net.hw7.domain.Plane;

public class PilotUtils {

    /**
     * 1. Uzupełnij metodę tak, aby sprawdzała czy pilot nie jest starszy niż doświadczenie, które posiada.
     */
    public boolean ageAndExperience(Pilot pilot) {
        if (pilot.getAge() > pilot.getExperience()) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 2. Uzupełnij metodę tak, aby sprawdzała czy pilot posiada odpowiednie doświadczenie
     * w stosunku do przyznanych uprawnień.
     * - junior exp < 5;
     * - mid 10 > exp > 5;
     * - senior exp > 10;
     */
    public boolean checkPermissions(Pilot pilot, Plane plane) {
        if ((pilot.getExperience() < 5 && plane.getModel() == "Boeing 737") && pilot.getPermissions() == "Allowed" ||
                ((pilot.getExperience() > 5 && pilot.getExperience() < 10) &&
                        (plane.getModel() == "Boeing 737" || plane.getModel() == "Boeing 787") && pilot.getPermissions() == "Allowed") ||
                ((pilot.getExperience() > 10 )&&
                        (plane.getModel() == "Boeing 737"  ||
                                plane.getModel() == "Boeing 787" ||
                                plane.getModel() == "Airbus A380") && pilot.getPermissions() == "Allowed")
        ) {

            return true;
        } else {
            return false;
        }
    }
}
