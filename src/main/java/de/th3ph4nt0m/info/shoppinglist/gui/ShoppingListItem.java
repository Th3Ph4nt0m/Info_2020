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
  // Ende Attribute
  
  public ShoppingListItem(String pName) {
    this.name = pName;
  }

  // Anfang Methoden
  public String getName() {
    return name;
  }

  // Ende Methoden
} // end of Artikel

