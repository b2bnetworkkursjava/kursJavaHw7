package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;

public class PilotUtils {

    /**
     * 1. Uzupełnij metodę tak, aby sprawdzała czy pilot nie jest starszy niż doświadczenie, które posiada.
     */
    public boolean ageAndExperience(Pilot pilot) {
        int experience = pilot.getExperience();
        int age = pilot.getAge();
        boolean bool;
        if (age > experience) bool = true;
        else bool = false;
        return bool;
    }

    /**
     * 2. Uzupełnij metodę tak, aby sprawdzała czy pilot posiada odpowiednie doświadczenie
     * w stosunku do przyznanych uprawnień.
     * - junior exp < 5;
     * - mid 10 > exp > 5;
     * - senior exp > 10;
     */
    public boolean checkPermissions(Pilot pilot) {
        int experience = pilot.getExperience();
        String permissions = pilot.getPermissions();
        boolean bool;
        if (experience < 5 && permissions.equals("junior")) bool = true;
        else if (experience > 5 && experience < 10 && permissions.equals("mid")) bool = true;
        else if (experience > 10 && permissions.equals("senior")) bool = true;
        else bool = false;
        return bool;
    }
}