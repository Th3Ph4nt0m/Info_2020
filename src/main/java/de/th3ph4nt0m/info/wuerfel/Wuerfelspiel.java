/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Wuerfelspiel.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/8/25
 */

package de.th3ph4nt0m.info.wuerfel;

public class Wuerfelspiel {

    Wuerfel meinWuerfel = new Wuerfel();
    private int augensumme;

    public Wuerfelspiel() {

    }

    public void sechsMalWuerfeln() {
        for (int i = 0; i < 5; i++) {
            meinWuerfel.wuerfeln();
        }
    }

    public void printAugensumme() {
        System.out.println(getAugensumme());
    }

    public Wuerfel getMeinWuerfel() {
        return meinWuerfel;
    }

    public int getAugensumme() {
        return augensumme;
    }
}
