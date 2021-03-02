package de.th3ph4nt0m.info.shoppinglist.gui;

import de.th3ph4nt0m.info.abi.List;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.02.2021
 * @author T.Roffmann
 */

public class ShoppingList {
  
  // Anfang Attribute
  private final List<ShoppingListItem> einkaufsliste;
  // Ende Attribute
  
  public ShoppingList() {
    this.einkaufsliste = new List<ShoppingListItem>(); // Klammern nicht vergessen :-)
  }

  // Anfang Methoden
  public String listeAusgeben() {
    StringBuilder ausgabe = new StringBuilder("Einkaufsliste:" + "\r\n" + "\r\n");
    this.einkaufsliste.toFirst();
    //System.out.println("Einkaufsliste: ");
    while(this.einkaufsliste.hasAccess())
    {
      ausgabe.append(this.einkaufsliste.getContent().getName()).append("\r\n");
      //System.out.println(this.einkaufsliste.getContent().getName() + " ");
      this.einkaufsliste.next();
    }
    return ausgabe.toString();
  }

  public void hinzufuegen(String pArtikelName) {
    ShoppingListItem neuerShoppingListItem;
    if(!this.suchen(pArtikelName))
    {
      neuerShoppingListItem = new ShoppingListItem(pArtikelName);
      this.einkaufsliste.append(neuerShoppingListItem);
    }
    
  }

  public void loeschen(String pArtikelName) {
    if(this.suchen(pArtikelName))
    {
      this.einkaufsliste.remove();
    }
    else{
      //System.out.println("Der zu löschende Artikel wurde nicht in der Einkaufsliste gefunden!");
    }
    
  }

  public boolean suchen(String pArtikelName) {
    this.einkaufsliste.toFirst();
    while(this.einkaufsliste.hasAccess())
    {
      if(this.einkaufsliste.getContent().getName().equals(pArtikelName))
      {
        return true;
      }
      this.einkaufsliste.next();
    }
    return false;
  }

  // Ende Methoden
} // end of ShoppingList

