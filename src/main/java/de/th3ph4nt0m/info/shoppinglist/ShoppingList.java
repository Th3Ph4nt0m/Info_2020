/*
 * Copyright (c) 2021 Henrik Steffens
 *
 * ShoppingList.java is part of the Info_2020 project.
 * Info_2020 is licensed under the MIT license.
 */

package de.th3ph4nt0m.info.shoppinglist;

import de.th3ph4nt0m.info.abi.List;

public class ShoppingList {

    private List<ShoppingListItem> list;

    public boolean addItem(ShoppingListItem item){
        boolean exists = false;
        list.toFirst();
        while (list.hasAccess()){
            exists = list.getContent().getName().equalsIgnoreCase(item.getName());
            list.next();
        }
        if(!exists){
            list.insert(item);
            return true;
        } else
            return false;
    }

    public boolean removeItem(String itemName){
        boolean success = false;
        list.toFirst();
        while (list.hasAccess())
            if(list.getContent().getName().equalsIgnoreCase(itemName)){
                list.remove();
                success = true;
                break;
            } else {
                list.next();
            }
        return success;
    }

    public void printList(){
        list.toFirst();
        while (list.hasAccess()){
            System.out.println(list.getContent().getName());
            list.next();
        }
    }
}
