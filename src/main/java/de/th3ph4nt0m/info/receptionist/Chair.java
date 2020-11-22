/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Chair.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/11/22
 */

package de.th3ph4nt0m.info.receptionist;

public class Chair
{
    private Chair next;
    private Patient patient;


    public Chair(Patient patient)
    {
        this.patient = patient;
    }


    public Chair getNext()
    {
        return next;
    }

    public void setNext(Chair next)
    {
        this.next = next;
    }

    public Patient getPatient()
    {
        return patient;
    }

    public void setPatient(Patient patient)
    {
        this.patient = patient;
    }
}
