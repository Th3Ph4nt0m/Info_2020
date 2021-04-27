/*
 * Copyright (c) 2020 Henrik Steffens aka. Th3Ph4nt0m
 *
 * Card.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 *
 * last edit: 2021/3/11
 */

package de.th3ph4nt0m.voctrainer.model;

public class Card {
    private final String de, en;
    private int status;

    /**
     *
     * @param de German name
     * @param en English name
     * @param status Current status
     *
     */
    public Card(String de, String en, int status) {
        this.de = de;
        this.en = en;
        this.status = status;
    }


    public String getDe() {
        return de;
    }

    public String getEn() {
        return en;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
