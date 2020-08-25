/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Wuerfel.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/8/25
 */

package de.th3ph4nt0m.info.wuerfel;

import de.th3ph4nt0m.info.utils.Utils;

public class Wuerfel {

    Utils utils = new Utils();

    private int augenzahl;

    public int wuerfeln() {
        return utils.getRandom(1, 6);
    }


    public int getAugenzahl() {
        return augenzahl;
    }
}
