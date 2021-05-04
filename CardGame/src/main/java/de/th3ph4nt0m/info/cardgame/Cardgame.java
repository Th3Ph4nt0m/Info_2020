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
     * @param turns Number of turns the deck is to be shuffled
     */
    public void shuffle(int turns){
        Random rand = new Random();
        for (int i = 0; i < turns; i++) {
            int index1 = rand.nextInt(cards.length);
            int index2 = rand.nextInt(cards.length);
            swap(index1, index2);
        }
    }

    /**
     * Swaps two cards positions in the array
     * @param index1 Index of the first card
     * @param index2 Index of the second card
     */
    private void swap(int index1, int index2){
        Card card1 = cards[index1];
        Card card2 = cards[index2];

        cards[index1] = card2;
        cards[index2] = card1;
    }

    /**
     * Checks if the given card exists in the deck
     * @param face Card face as a string
     * @param value Card value as a string
     * @return true if the card exists | false if the card not exists
     */
    public boolean exists(String face, String value){
        for (int i = 0; i < cards.length; i++) {
            if(cards[i].getFace().toString().equalsIgnoreCase(face) && cards[i].toString().equalsIgnoreCase(value)){
                return true;
            }
        }
        return false;
    }
}
