/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Receptionist.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/12/1
 */

package de.th3ph4nt0m.info.receptionist;

public class Receptionist
{

    private final Lobby lobby;
    private String name;

    public Receptionist(Lobby lobby)
    {
        this.lobby = lobby;
    }

    public void callPatient()
    {
        lobby.callPatient();
    }

    public void takePatient()
    {
        lobby.takePatient(name);
    }
}
