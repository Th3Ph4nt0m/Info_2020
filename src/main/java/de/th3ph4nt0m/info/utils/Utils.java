/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Utils.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2020/9/30
 */

package de.th3ph4nt0m.info.utils;

import java.util.Arrays;

@SuppressWarnings("OptionalGetWithoutIsPresent")
public class Utils
{

    //getting a random number between a min and a max given in the parameters
    public int getRandom(int min, int max)
    {
        int range = (max - min) + 1;
        return (int) ((Math.random() * range) + min);
    }

    //getting the largest number from an int array
    public int maxValue(int[] toCount)
    {
        return Arrays.stream(toCount).max().getAsInt();
    }

    //swapping to numbers in an array
    private static void swap(int[] array, int from, int to)
    {
        int temp = array[from];
        array[from] = array[to];
        array[to] = temp;
    }

    //sorting an integer array using bubble sort algorithm
    public int[] doBubbleSort(int[] nums)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                }
            }
        }
        return nums;
    }
}
