/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Casino.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/9/10
 */

package de.th3ph4nt0m.info.wuerfel;

import de.th3ph4nt0m.info.utils.Utils;

public class Casino
{
    private final Wuerfelspiel[] spielTische;
    //initializing attributes/objects/variables
    Utils utils = new Utils();

    //Constructor
    public Casino(int pSpielAnzahl)
    {
        spielTische = new Wuerfelspiel[pSpielAnzahl];
        erzeugeSpieltische();
    }

    //generate the single objects for each "part" of the array
    private void erzeugeSpieltische()
    {
        for (int i = 0; i < spielTische.length; i++) {
            spielTische[i] = new Wuerfelspiel();
        }
    }

    //excecute Wuerfelspiel#sechsMalWuerfeln for every object in the array
    public void spieleStarten()
    {
        for (int i = 0; i < spielTische.length; i++) {
            spielTische[i].sechsMalWuerfeln();
        }
    }

    //print the "results" of the single objects and the winner
    public void spieltischeAusgeben()
    {
        int[] ii = new int[spielTische.length];
        for (int i = 0; i < spielTische.length; i++) {
            ii[i] = spielTische[i].getAugensumme();
            System.out.println("Am Spieltisch " + i + " wurde die Augensumme " + spielTische[i].getAugensumme() + " erreicht.");
        }
        System.out.println("Gewonnen hat Tisch " + utils.maxValue(ii) + ". Herzlichen Glückwunsch!");
    }
}
