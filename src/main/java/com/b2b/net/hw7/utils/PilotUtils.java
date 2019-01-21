package com.b2b.net.hw7.utils;

import com.b2b.net.hw7.domain.Pilot;

public class PilotUtils {

    /**
     * 1. Uzupełnij metodę tak, aby sprawdzała czy pilot nie jest starszy niż doświadczenie, które posiada.
     */
    public boolean ageAndExperience(Pilot pilot) {
        boolean bool;
        if (pilot.getAge() > pilot.getExperience()) {
            bool = true;
        } else {
            bool = false;
        }
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
        boolean bool;
        if ((pilot.getPermissions().equals("junior")&& pilot.getExperience()<5) || (pilot.getPermissions().equals("mid")&& pilot.getExperience()>5 && pilot.getExperience()<10) || (pilot.getPermissions().equals("senior")&& pilot.getExperience()>10)){
            bool = true;
        } else{
            bool = false;
        }
        return bool;
    }
}
