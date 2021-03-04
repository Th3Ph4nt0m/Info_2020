package de.th3ph4nt0m.info.shoppinglist.gui;

import com.google.gson.Gson;
import de.th3ph4nt0m.info.abi.List;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Beschreibung
 *
 * @author T.Roffmann
 * @version 1.0 vom 18.02.2021
 */

public class ShoppingList {

    // Anfang Attribute
    private final List<ShoppingListItem> shoppingList;
    private Gson gson = new Gson();
    // Ende Attribute

    public ShoppingList() {
        this.shoppingList = new List<>(); // Klammern nicht vergessen :-)
    }

    // Anfang Methoden
    public String getList() {
        StringBuilder ausgabe = new StringBuilder("Einkaufsliste:" + "\r\n" + "\r\n");
        this.shoppingList.toFirst();
        while (this.shoppingList.hasAccess()) {
            ausgabe.append(this.shoppingList.getContent().getName()).append("\r\n");
            this.shoppingList.next();
        }
        return ausgabe.toString();
    }

    public void add(String pArtikelName) {
        ShoppingListItem neuerShoppingListItem;
        if (!this.exists(pArtikelName)) {
            neuerShoppingListItem = new ShoppingListItem(pArtikelName, 1);
            this.shoppingList.append(neuerShoppingListItem);
        }

    }

    public void rmv(String pArtikelName) {
        if (this.exists(pArtikelName)) {
            this.shoppingList.remove();
        } else {
            //System.out.println("Der zu löschende Artikel wurde nicht in der Einkaufsliste gefunden!");
        }

    }

    public boolean exists(String pArtikelName) {
        this.shoppingList.toFirst();
        while (this.shoppingList.hasAccess()) {
            if (this.shoppingList.getContent().getName().equals(pArtikelName)) {
                return true;
            }
            this.shoppingList.next();
        }
        return false;
    }

/*  public ShoppingListItem getItemByName(String name){

  }*/

    public boolean storeItem(ShoppingListItem item) {
        try (Writer writer = Files.newBufferedWriter(Paths.get("list.json"))) {
            gson.toJson(item, writer);
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


    // Ende Methoden
} // end of ShoppingList

