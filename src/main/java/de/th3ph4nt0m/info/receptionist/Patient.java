/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * Patient.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.receptionist;

public class Patient
{
    private final String name;
//    private Patient next;

    public Patient(String pName)
    {
        this.name = pName;
    }

/*    public Patient getNext()
    {
        return next;
    }*/

/*    public void setNext(Patient next)
    {
        this.next = next;
    }*/

    public String getName()
    {
        return name;
    }
}
