/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * WuerfelspielLauncher.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.launcher;

import de.th3ph4nt0m.info.utils.Utils;
import de.th3ph4nt0m.info.wuerfel.Wuerfel;

import java.util.Arrays;

public class WuerfelspielLauncher
{

    private static Wuerfel wuerfel;
    private static Utils utils;
    private static int[] toSort;

    public WuerfelspielLauncher(Wuerfel wuerfel, Utils utils)
    {
        WuerfelspielLauncher.wuerfel = wuerfel;
        WuerfelspielLauncher.utils = utils;
        toSort = WuerfelspielLauncher.wuerfel.buildArray(15);
    }

    //a main method to excecute the code of the WurfelSpiel-project --> I can't just create objects with a GUI in IntelliJ
    public static void main(String[] s)
    {
        System.out.println(toSort);
        System.out.println(Arrays.toString(utils.doBubbleSort(toSort)));
    }
}
