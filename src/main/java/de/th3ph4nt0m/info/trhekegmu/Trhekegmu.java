package de.th3ph4nt0m.info.trhekegmu;


import de.th3ph4nt0m.info.abi.Queue;
import de.th3ph4nt0m.info.abi.Stack;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("SpellCheckingInspection")
public class Trhekegmu {

    private static final Queue<Integer> q = new Queue<>();
    private static final Stack<Integer> s = new Stack<>();

    public static void main(String[] args) {
        execute("10,4,6,8,1,3,2");
        printNums();
    }

    public static void execute(String text) {
        List<String> list = Arrays.asList(text.split(","));

        int i = 0;

        while (!list.isEmpty()) {
            if (list.size() != i) {
                q.enqueue(Integer.parseInt(list.get(i)));

                i++;
            } else {
                break;
            }
        }

        while (!q.isEmpty()) {
            s.push(q.front());
            q.dequeue();
        }
    }

    public static void printNums() {
        String txt = "";

        while (!s.isEmpty()) {
            txt = txt + s.top() + "\n";
            s.pop();
        }

        System.out.println(txt);

    }
}
