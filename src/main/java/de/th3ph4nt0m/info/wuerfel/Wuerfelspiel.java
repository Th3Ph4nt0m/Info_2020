/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Wuerfelspiel.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/9/3
 */

package de.th3ph4nt0m.info.wuerfel;

@SuppressWarnings("ALL")
public class Wuerfelspiel
{

    //initializing attributes/objects/variables
    Wuerfel meinWuerfel = new Wuerfel();
    private int augensumme;
    private int[] history = new int[6];

    //standard constructor
    public Wuerfelspiel()
    {

    }

    //rolls the dice six times, saves the total of dice eyes and saves the dice eye number of every move
    public void sechsMalWuerfeln()
    {
        augensumme = 0;
        for (int i = 0; i < 5; i++) {
            meinWuerfel.wuerfeln();
            augensumme = augensumme + meinWuerfel.getAugenzahl();
            history[i] = meinWuerfel.getAugenzahl();
        }
        //printig out the array --> not formatted
        System.out.println(history);
    }


    //Getter methods
    public void printAugensumme()
    {
        System.out.println(getAugensumme());
    }

    public Wuerfel getMeinWuerfel()
    {
        return meinWuerfel;
    }

    public int getAugensumme()
    {
        return augensumme;
    }
}
