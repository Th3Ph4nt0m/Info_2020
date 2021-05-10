/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * Cardgame.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.cardgame;

import de.th3ph4nt0m.info.cardgame.model.Card;

import java.util.Random;

public class Cardgame {
    Card[] cards;

    /**
     * Creates a "Skat" card deck (32 cards).
     */
    public Cardgame() {
        this.cards = new Card[32];
        for (Card.Value value : Card.Value.values()) {
            for (Card.Face face : Card.Face.values()) {
                for (int i = 0; i < cards.length; i++) {
                    cards[i] = new Card(value, face);
                }
            }
        }
    }

    /**
     * Shuffles the whole card deck
     *
     * @param turns Number of turns the deck is to be shuffled
     */
    public void shuffle(int turns) {
        Random rand = new Random();
        for (int i = 0; i < turns; i++) {
            int index1 = rand.nextInt(cards.length);
            int index2 = rand.nextInt(cards.length);
            swap(index1, index2);
        }
    }

    /**
     * Swaps two cards positions in the array
     *
     * @param index1 Index of the first card
     * @param index2 Index of the second card
     */
    private void swap(int index1, int index2) {
        Card card1 = cards[index1];
        Card card2 = cards[index2];

        cards[index1] = card2;
        cards[index2] = card1;
    }

    /**
     * Checks if the given card exists in the deck
     *
     * @param face  Card face as a string
     * @param value Card value as a string
     * @return true if the card exists | false if the card not exists
     */
    public boolean exists(String face, String value) {
        for (Card card : cards) {
            if (card.getFace().toString().equalsIgnoreCase(face) && card.toString().equalsIgnoreCase(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Removes all cards of a given value
     *
     * @param value Value of the cards to be removed
     */
    public void remove(String value) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].getValue().toString().equalsIgnoreCase(value)) {
                cards[i] = null;
            }
        }
    }

    /**
     * Calculates the distribution of the suits in the first half of the deck
     *
     * @return 0 if red amount equals black amount | 1 if black amount is higher than red amount | 2 if black amount is lower than red amount
     */
    public int countFirstHalf() {
        int counter = 0;
        for (int i = 0, cardsLength = 16; i < cardsLength; i++) {
            Card card = cards[i];
            if (card.getValue().equals(Card.Value.CLUB) || card.getValue().equals(Card.Value.SPADE)) {
                counter++;
            }
        }
        int result = 16 - counter;

        if (result < counter) {
            return 2;
        } else if (result > counter) {
            return 1;
        } else {
            return 0;
        }
    }
}
