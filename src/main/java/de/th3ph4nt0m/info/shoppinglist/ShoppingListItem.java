/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * ShoppingListItem.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.shoppinglist;

public class ShoppingListItem {

    private final String name;
    private final int amount;


    public ShoppingListItem(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
