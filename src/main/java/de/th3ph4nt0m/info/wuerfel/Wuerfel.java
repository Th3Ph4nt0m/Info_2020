/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * Wuerfel.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.wuerfel;

import de.th3ph4nt0m.info.utils.Utils;

@SuppressWarnings({"ConstantConditions", "UnusedReturnValue", "unused", "RedundantSuppression"})
public class Wuerfel
{

    //initializing attributes/objects/variables
    Utils utils = new Utils();

    private int augenzahl;

    //rolls the dice --> returns a random number between 1 and 6
    public int wuerfeln()
    {
        return utils.getRandom(1, 6);
    }

    //Getter methods
    public int getAugenzahl()
    {
        return augenzahl;
    }


    //builds an array with a specific length
    public int[] buildArray(int lenth)
    {
        //declare the array
        int[] array = new int[lenth];
        for (int i = 0; i < array.length; i++) {
            //initialize every int in the array with a random number between 0 and 100
            array[i] = utils.getRandom(0, 100);
        }
        //returns the completed array
        return array;
    }


}
