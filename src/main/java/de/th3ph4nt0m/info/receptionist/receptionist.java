/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * receptionist.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/11/22
 */

package de.th3ph4nt0m.info.receptionist;

public class receptionist
{
/*    private Patient first;
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
    }*/


    private Chair first;
    private Chair last;


    public Patient getFirstPatient()
    {
        return first.getPatient();
    }

    public Patient getLastPatient()
    {
        return last.getPatient();
    }

    public Chair getFirstChair()
    {
        return first;
    }

    public void setFirstChair(Chair first)
    {
        this.first = first;
    }

    public Chair getLastChair()
    {
        return last;
    }

    public void setLastChair(Chair last)
    {
        this.last = last;
    }

    public boolean isEmpty()
    {
        return first == null;
    }

    public Chair front()
    {
        return getFirstChair();
    }

    public void callPatient()
    {
        //case 1: no patient
        if (isEmpty()) {
            System.out.println("There is no patient in the waiting room.");
        } else if (this.first.equals(this.last)) { //case 2: only 1 patient
            System.out.println("Come in " + getFirstPatient().getName());
            this.first = null;
            this.last = null;
        } else { //case 3: more than one patient
            System.out.println("Come in " + getFirstPatient().getName());
            this.first = this.first.getNext();
        }
    }

    public void takePatient(String pName)
    {
        Patient patient = new Patient(pName);
        Chair chair = new Chair(patient);

        if (isEmpty()) { //queue is empty
            setFirstChair(chair);
            setLastChair(chair);
        } else {
            getLastChair().setNext(chair);
            //TODO finish
        }
    }
}
