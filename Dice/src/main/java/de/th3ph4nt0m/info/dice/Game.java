package de.th3ph4nt0m.info.dice;

public class Game {
    private final Dice dice;

    public Game(int dicePages) {
        this.dice = new Dice(dicePages);
    }

    public int addXIterative(int rounds) {
        int resp = 0;
        for (int i = 0; i < rounds; i++) {
            resp += dice.roll();
        }
        return resp;
    }

    public int addXRecursive(int rounds) {
        if (rounds > 0) {
            if (rounds == 1) {
                return dice.roll();
            } else {
                return dice.roll() + addXRecursive(rounds - 1);
            }
        }
        return 0;
    }

    public int findMax(int amount) {
        int max = 0;
        for (int i = 0; i < amount; i++) {
            int tmp = dice.roll();

            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }

    public int recStart(int amount){
        return findMaxRec(amount, 0);
    }

    public int findMaxRec(int amount, int max){
        int maxx = max;

        if(amount == 0){
            return max;
        } else{
            int round = dice.roll();
            if(round > max){
                maxx = round;
            }
            return findMaxRec(amount - 1, max);
        }
    }

    public long intXResultsIterative(int amount) {
        long resp = 0;
        for (int i = 1; i < (amount + 1); i++) {
            resp += dice.roll() * (long) Math.pow(10, amount - i);
        }
        return resp;
    }

    public Dice getDice() {
        return dice;
    }
}
