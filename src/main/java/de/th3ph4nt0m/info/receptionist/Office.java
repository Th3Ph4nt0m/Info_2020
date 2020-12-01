/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Office.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/12/1
 */

package de.th3ph4nt0m.info.receptionist;

public class Office
{

    private final Lobby lobyy;
    private final Receptionist receptionist;

    public Office()
    {
        this.lobyy = new Lobby();
        this.receptionist = new Receptionist(lobyy);
    }
}
