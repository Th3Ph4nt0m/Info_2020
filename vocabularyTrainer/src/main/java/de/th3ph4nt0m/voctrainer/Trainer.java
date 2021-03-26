/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Trainer.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2021/3/11
 */

package de.th3ph4nt0m.voctrainer;

import de.th3ph4nt0m.voctrainer.controller.CardController;

public class Trainer {

    private final CardController controller;

    public Trainer(){
        controller = new CardController();
    }

    public boolean checkInput(String input, boolean isEnglish){
        if(isEnglish){
            if(controller.getVocList().getContent().getEn().equalsIgnoreCase(input)){
                controller.setStatus(controller.getVocList().getContent().getStatus() + 1);
                return true;
            }
        } else {
            if(controller.getVocList().getContent().getDe().equalsIgnoreCase(input)){
                controller.setStatus(controller.getVocList().getContent().getStatus() + 1);
                return true;
            }
        }
        return false;
    }

    public CardController getController() {
        return controller;
    }
}
