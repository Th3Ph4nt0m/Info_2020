/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * CardController.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2021/3/11
 */

package de.th3ph4nt0m.voctrainer.controller;

import de.th3ph4nt0m.voctrainer.abi.List;
import de.th3ph4nt0m.voctrainer.model.Card;

public class CardController {
    private final List<Card> vocList;

    public CardController() {
        this.vocList = new List<>();
    }

    public void addCard(Card card) {
        vocList.append(card);
    }

    private void readFile(){

    }

    public void setStatus(int newStatus){
        vocList.getContent().setStatus(newStatus);
    }

    public List<Card> getVocList() {
        return vocList;
    }
}
