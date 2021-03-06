/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * Disc.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.cdSammlung;

public class Disc
{
    private final String title;
    private final String interpret;
    private final int year;

    public Disc(String pTitle, String pInterpret, int pYear)
    {
        this.title = pTitle;
        this.interpret = pInterpret;
        this.year = pYear;
    }

    public String getTitle()
    {
        return title;
    }

    public String getInterpret()
    {
        return interpret;
    }

    public int getYear()
    {
        return year;
    }
}
