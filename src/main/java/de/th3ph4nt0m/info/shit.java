package de.th3ph4nt0m.info;

public class shit {

    public static int bla(int x, int y) {
        if (y == 1) {
            return x;
        } else {
            return x + bla(x, y - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(bla(4, 0));
    }
}
