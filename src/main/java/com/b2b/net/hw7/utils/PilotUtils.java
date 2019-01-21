package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;

public class PilotUtils {

    /**
     * 1. Uzupełnij metodę tak, aby sprawdzała czy pilot nie jest starszy niż doświadczenie, które posiada.
     */
    public boolean ageAndExperience(Pilot pilot) {
        int experience = pilot.getExperience();
        int age = pilot.getAge();
        boolean result;
        if (age > experience) result = true;
        else result = false;
        return result;
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
        boolean result;
        if (experience < 5 && permissions.equals("junior")) result = true;
        else if (experience > 5 && experience < 10 && permissions.equals("mid")) result = true;
        else if (experience > 10 && permissions.equals("senior")) result= true;
        else result = false;
        return result;
}
    }

