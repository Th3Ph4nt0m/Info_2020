/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * receptionist.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/11/12
 */

package de.th3ph4nt0m.info.receptionist;

public class receptionist
{
    private Patient first;
    private Patient last;

    private void callPatient()
    {
        //case 1: no patient
        if (this.first == null) {
            System.out.println("There is no patient in the waiting room.");
            //case 2: only 1 patient
        } else if (this.first == this.last) {
            System.out.println("Come in, " + this.first.getName() + "!");
            this.first = null;
            this.last = null;
            //case 3: more than 1 patients
        } else {
            System.out.println("Come in, " + this.first.getName() + "!");
            this.first = this.first.getNext();
        }
    }

    private void takePatient(String name)
    {
        Patient patient = new Patient(name); //init a new patient

        if (isEmpty()) { //case: the queue is empty
            this.first = patient;
        } else { //min. one patient is waiting
            this.last.setNext(patient);
        }
        this.last = patient;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public Patient front()
    {
        return first;
    }

    public Patient getLast()
    {
        return last;
    }
}
