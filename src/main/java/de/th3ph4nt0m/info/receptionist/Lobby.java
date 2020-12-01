/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Lobby.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/12/1
 */

package de.th3ph4nt0m.info.receptionist;

public class Lobby
{
    private Chair first;
    private Chair last;

    public Lobby()
    {
    }

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
            this.last = chair;
        }
    }

    private static class Chair
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
}
