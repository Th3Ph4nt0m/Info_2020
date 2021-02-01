/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * DiscShelf.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.cdSammlung;

import java.util.Arrays;
import java.util.Comparator;

public class DiscShelf
{
    private final Disc[] discs;

    public DiscShelf()
    {
        this.discs = new Disc[50];
    }

    public void addDisc(String pTitle, String pInterpret, int pYear)
    {
        boolean inserted = false;

        for (int i = 0; i < discs.length && !inserted; i++) { //search the first empty slot
            if (this.discs[i] == null) {
                this.discs[i] = new Disc(pTitle, pInterpret, pYear);
                inserted = true;
            }
        }
    }

    public int searchDisc(String pTitle)
    {
        int j = -1;
        for (int i = 0; i < discs.length; i++) {
            if (discs[i].getTitle().equals(pTitle)) {
                j = i;
            }
        }
        return j;
    }

    public void removeDisc(int pIndex)
    {
        discs[pIndex] = null;
    }

    private void sortByYear()
    {
        Arrays.sort(discs, Comparator.comparing(Disc::getYear));
    }

    private void sortByInterpret()
    {
        Arrays.sort(discs, Comparator.comparing(Disc::getInterpret));
    }

    private void sortByTitle()
    {
        Arrays.sort(discs, Comparator.comparing(Disc::getTitle));
    }

    public void printAllTitles()
    {
        for (int i = 0; i < discs.length; i++) {
            System.out.println(i + ": " + discs[i].getTitle());
        }
    }
}
