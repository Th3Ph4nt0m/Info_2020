/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Patient.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/11/22
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
