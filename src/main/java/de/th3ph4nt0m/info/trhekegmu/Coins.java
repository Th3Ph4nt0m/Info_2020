/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * Coins.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.trhekegmu;

import de.th3ph4nt0m.info.abi.Stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Coins {

    public static void main(String[] args) {
        Stack<Integer> s = createStack();

        Stack<Integer> ten = new Stack<>();
        Stack<Integer> twenty = new Stack<>();
        Stack<Integer> fifty = new Stack<>();
        Stack<Integer> oneEuro = new Stack<>();
        Stack<Integer> twoEuro = new Stack<>();

        while (!s.isEmpty()){
            Integer top = s.top();
            if (top == 10) {
                ten.push(s.top());
                s.pop();
            } else if (top == 20) {
                twenty.push(s.top());
                s.pop();
            } else if (top == 50) {
                fifty.push(s.top());
                s.pop();
            } else if (top == 100) {
                oneEuro.push(s.top());
                s.pop();
            } else if (top == 200) {
                twoEuro.push(s.top());
                s.pop();
            }else {
                System.out.println("Fail");
            }
        }

        int vTen = getStackSize(ten);
        int vTwenty = getStackSize(twenty);
        int vFifty = getStackSize(fifty);
        int vOne = getStackSize(oneEuro);
        int vTwo = getStackSize(twoEuro);

        System.out.println("Stack with 10-Cent-Coins has " + vTen + " Coins with a total value of " + (vTen * 10) + " cent.");
        System.out.println("Stack with 10-Cent-Coins has " + vTwenty + " Coins with a total value of " + (vTwenty * 10) + " cent.");
        System.out.println("Stack with 10-Cent-Coins has " + vFifty + " Coins with a total value of " + (vFifty * 10) + " cent.");
        System.out.println("Stack with 10-Cent-Coins has " + vOne + " Coins with a total value of " + (vOne * 10) + " cent.");
        System.out.println("Stack with 10-Cent-Coins has " + vTwo + " Coins with a total value of " + (vTen * 10) + " cent.");
}

    private static int getStackSize(Stack<Integer> stack){
        int value = 0;
        while (!stack.isEmpty()){
            value++;
            stack.pop();
        }
        return value;
    }

    private static Stack<Integer> createStack(){
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(50);
        list.add(100);
        list.add(200);

        Random rand = new Random();

        Stack<Integer> coins = new Stack<>();

        for(int i = 0; i<20; i++){
            coins.push(list.get(rand.nextInt(list.size())));
//            System.out.println(list.get(rand.nextInt(list.size())));
        }
        return coins;
    }

}

