/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Casino.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/10/27
 */

package de.th3ph4nt0m.info.wuerfel;

import de.th3ph4nt0m.info.utils.Utils;

@SuppressWarnings({"ForLoopReplaceableByForEach", "unused", "RedundantSuppression", "FieldCanBeLocal", "FieldMayBeFinal"})
public class Casino
{
    //initializing attributes/objects/variables
    Utils utils = new Utils();
    private final Wuerfelspiel[] spielTische;
    private int[][] tischAugensumme;

    //Constructor
    public Casino(int pSpielAnzahl)
    {
        spielTische = new Wuerfelspiel[pSpielAnzahl];
        tischAugensumme = new int[2][pSpielAnzahl];
        erzeugeSpieltische();
    }

    //generate the single objects for each "part" of the array
    private void erzeugeSpieltische()
    {
        for (int i = 0; i < spielTische.length; i++) {
            spielTische[i] = new Wuerfelspiel();
        }
    }


    public void spieleStarten()
    {
        for (int i = 0; i < spielTische.length; i++) {
            //excecute Wuerfelspiel#sechsMalWuerfeln for every object in the array
            spielTische[i].sechsMalWuerfeln();
            //saving the table number and the result of each table in 2D-Array
            tischAugensumme[0][i] = i + 1; //saving the table number, not the index in line 1
            tischAugensumme[1][i] = spielTische[i].getAugensumme();
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
        System.out.println("Gewonnen hat Tisch " + (utils.maxValue(ii) + 1) + ". Herzlichen Glückwunsch!");
    }
}
