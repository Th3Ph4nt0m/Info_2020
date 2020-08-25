/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Utils.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/8/25
 */

package de.th3ph4nt0m.info.utils;

public class Utils {

    public int getRandom(int min, int max) {
        int range = (max - min) + 1;
        return (int) ((Math.random() * range) + min);
    }
}
