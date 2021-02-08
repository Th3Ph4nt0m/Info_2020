/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * Palindrome.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.palindrome;

import de.th3ph4nt0m.info.abi.Queue;
import de.th3ph4nt0m.info.abi.Stack;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(check(in.next()));
    }

    private static boolean check(String palindrome) {
        char[] chars = palindrome.toCharArray();
        Stack<Character> pal = new Stack<>();
        boolean isPalindrome = false;

        for (char c : chars) {
            pal.push(Character.toLowerCase(c));
        }

        for (char aChar : chars) {
            isPalindrome = pal.top().equals(Character.toLowerCase(aChar));
            pal.pop();
        }
        return isPalindrome;
    }

    public String create(String text){
        Queue<Character> q = new Queue<>();
        Stack<Character> s = new Stack<>();
        List<String> list = Arrays.asList(text.split(""));

        int i = 0;

        while (!list.isEmpty()){
            if(list.size() != i){
                q.enqueue(list.get(i).toCharArray()[0]);
                i++;
            }else{
                break;
            }
        }

        while (!q.isEmpty()){
            s.push(q.front());
            q.dequeue();
        }

        StringBuilder txt = new StringBuilder();
        while (!s.isEmpty()){
            txt.append(s.top());
            s.pop();
        }

        return txt.toString();
    }
}
