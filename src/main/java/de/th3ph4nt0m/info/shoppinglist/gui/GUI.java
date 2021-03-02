package de.th3ph4nt0m.info.shoppinglist.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 25.02.2021
 * @author T. Roffmann
 */

public class GUI extends JFrame {
  // Anfang Attribute
  private final ShoppingList meinShoppingList;
  
  private final JTextField tfShoppingList = new JTextField();
  private final JTextArea jTextArea1 = new JTextArea("");
  // Ende Attribute
  
  public GUI() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    this.meinShoppingList = new ShoppingList();
    int frameWidth = 513; 
    int frameHeight = 728;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("ShoppingList");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    tfShoppingList.setBounds(72, 24, 358, 52);
    this.tfShoppingList.setText("Bitte neuen Artikel hinzufügen...");
    tfShoppingList.setHorizontalAlignment(SwingConstants.CENTER);
    tfShoppingList.addFocusListener(new FocusAdapter() {
      public void focusGained(FocusEvent evt) { 
        tfShoppingList_FocusGained(evt);
      }
    });
    tfShoppingList.addFocusListener(new FocusAdapter() {
      public void focusLost(FocusEvent evt) { 
        tfShoppingList_FocusLost(evt);
      }
    });
    cp.add(tfShoppingList);
    JButton bHinzufugen = new JButton();
    bHinzufugen.setBounds(88, 160, 131, 65);
    bHinzufugen.setText("Hinzufügen");
    bHinzufugen.setMargin(new Insets(2, 2, 2, 2));
    bHinzufugen.addActionListener(this::bHinzufugen_ActionPerformed);
    bHinzufugen.setBackground(Color.RED);
    bHinzufugen.setFont(new Font("Dialog", Font.BOLD, 20));
    cp.add(bHinzufugen);
    JButton bAusgeben = new JButton();
    bAusgeben.setBounds(288, 160, 131, 65);
    bAusgeben.setText("Ausgeben");
    bAusgeben.setMargin(new Insets(2, 2, 2, 2));
    bAusgeben.addActionListener(this::bAusgeben_ActionPerformed);
    bAusgeben.setFont(new Font("Dialog", Font.BOLD, 18));
    bAusgeben.setBackground(Color.GREEN);
    cp.add(bAusgeben);
    JButton bSuchen = new JButton();
    bSuchen.setBounds(88, 248, 131, 65);
    bSuchen.setText("Suchen");
    bSuchen.setMargin(new Insets(2, 2, 2, 2));
    bSuchen.addActionListener(this::bSuchen_ActionPerformed);
    bSuchen.setBackground(Color.YELLOW);
    bSuchen.setFont(new Font("Dialog", Font.BOLD, 18));
    cp.add(bSuchen);
    JButton bLoschen = new JButton();
    bLoschen.setBounds(288, 248, 131, 65);
    bLoschen.setText("Löschen");
    bLoschen.setMargin(new Insets(2, 2, 2, 2));
    bLoschen.addActionListener(this::bLoschen_ActionPerformed);
    bLoschen.setBackground(new Color(0xFF80FF));
    bLoschen.setFont(new Font("Dialog", Font.BOLD, 18));
    cp.add(bLoschen);
    JScrollPane jTextArea1ScrollPane = new JScrollPane(jTextArea1);
    jTextArea1ScrollPane.setBounds(56, 360, 385, 289);
    cp.add(jTextArea1ScrollPane);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public GUI
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new GUI();
  } // end of main
  
  public void bHinzufugen_ActionPerformed(ActionEvent evt) {
    String eingabe = this.tfShoppingList.getText();
    this.meinShoppingList.hinzufuegen(eingabe);
    this.tfShoppingList.setText("");
    this.tfShoppingList.setText("Bitte neuen Artikel hinzufügen...");
  } // end of bHinzufugen_ActionPerformed

  public void bAusgeben_ActionPerformed(ActionEvent evt) {
    this.jTextArea1.setText(this.meinShoppingList.listeAusgeben());
    
  } // end of bAusgeben_ActionPerformed

  public void bSuchen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bSuchen_ActionPerformed

  public void bLoschen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    
  } // end of bLoschen_ActionPerformed

  public void tfShoppingList_FocusGained(FocusEvent evt) {
    this.tfShoppingList.setText("");
    
  } // end of tfShoppingList_FocusGained

  public void tfShoppingList_FocusLost(FocusEvent evt) {
    //this.tfShoppingList.setText("Bitte neuen Artikel hinzufügen...");
    
  } // end of tfShoppingList_FocusLost

  // Ende Methoden
} // end of class GUI

