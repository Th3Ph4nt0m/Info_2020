/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * Card.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.cardgame.model;

public class Card implements Comparable<Card> {

    private final Value value;
    private final Face face;

    public Card(Value value, Face face) {

        this.value = value;
        this.face = face;
    }

    public Value getValue() {
        return this.value;
    }

    public Face getFace() {
        return this.face;
    }


    public enum Value {
        DIAMOND,
        HEART,
        SPADE,
        CLUB;


        @Override
        public String toString() {
            switch (this) {
                case DIAMOND:
                    return "♦";
                case CLUB:
                    return "♣";
                case HEART:
                    return "♥";
                case SPADE:
                    return "♠";
            }
            return null;
        }
    }

    public enum Face {
        SEVEN,
        EIGHT,
        NINE,
        JACK,
        QUEEN,
        KING,
        TEN,
        AS;


        @Override
        public String toString() {
            switch (this) {
                case SEVEN:
                    return "7";
                case EIGHT:
                    return "8";
                case NINE:
                    return "9";
                case JACK:
                    return "J";
                case QUEEN:
                    return "Q";
                case KING:
                    return "K";
                case TEN:
                    return "10";
                case AS:
                    return "A";
            }
            return null;
        }
    }

    @Override
    public int compareTo(Card c) {
        if (value.ordinal() < c.getValue().ordinal())
            return -1;
        if (value.ordinal() > c.getValue().ordinal())
            return 1;

        return Integer.compare(c.getFace().ordinal(), face.ordinal());
    }

    @Override
    public String toString() {
        return value.toString() + face.toString();
    }
}
