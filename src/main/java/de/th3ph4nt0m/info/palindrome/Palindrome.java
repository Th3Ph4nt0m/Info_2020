package de.th3ph4nt0m.info.palindrome;

import de.th3ph4nt0m.info.abi.Stack;

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
}
