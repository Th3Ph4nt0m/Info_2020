package de.th3ph4nt0m.info.shoppinglist.gui;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.02.2021
 * @author T. Roffmann
 */

public class ShoppingListItem {
  
  // Anfang Attribute
  private final String name;
  private int amount;

  // Ende Attribute

  public ShoppingListItem(String pName, int amount) {
    this.name = pName;
    this.amount = amount;
  }

  // Anfang Methoden
  public void setAmount(int amount) {
    this.amount = amount;
  }

  public int getAmount() {
    return amount;
  }

  public String getName() {
    return name;
  }

  // Ende Methoden
} // end of Artikel

