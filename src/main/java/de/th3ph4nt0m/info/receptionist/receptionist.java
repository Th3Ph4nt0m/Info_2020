/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * receptionist.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/11/24
 */

package de.th3ph4nt0m.info.receptionist;

public class receptionist
{
    public void callPatient()
    {
        Lobby.getInstance().callPatient();
    }

    public void takePatient(String pName)
    {
        Lobby.getInstance().takePatient(pName);
    }
}
