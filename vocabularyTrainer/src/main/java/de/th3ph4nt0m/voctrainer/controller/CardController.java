/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * CardController.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2021/3/11
 */

package de.th3ph4nt0m.voctrainer.controller;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import de.th3ph4nt0m.voctrainer.abi.List;
import de.th3ph4nt0m.voctrainer.model.Card;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CardController {
    private final List<Card> vocList;

    public CardController() {
        this.vocList = new List<>();
    }

    public void addCard(Card card) {
        vocList.append(card);
    }

    private void readFile(){

        try {
            // create Gson instance
            Gson gson = new Gson(); // necessary??

            // create reader
            Reader reader = Files.newBufferedReader(Paths.get("cards.json"));

            // convert JSON array to list of cards
            List<Card> cards = new Gson().fromJson(reader, new TypeToken<List<Card>>() {}.getType());

            // add users to original list
            clearVocList();
            while (cards.hasAccess()){
                vocList.append(cards.getContent());
                cards.next();
            }

            // close reader
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveFile(){
        try {
            // create writer
            Writer writer = new FileWriter("cards.json");

            // convert card list to JSON file
            new Gson().toJson(vocList, writer);

            //close writer
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void clearVocList(){
        while (vocList.hasAccess()){
            vocList.remove();
        }
    }

    public void setStatus(int newStatus){
        vocList.getContent().setStatus(newStatus);
    }

    public List<Card> getVocList() {
        return vocList;
    }
}
