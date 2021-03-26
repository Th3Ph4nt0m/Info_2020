package de.th3ph4nt0m.voctrainer;

import de.th3ph4nt0m.voctrainer.model.Card;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

@SuppressWarnings("SpellCheckingInspection")
public class GUI extends JFrame {
    // Anfang Attribute
    private final JTextField jTextField1 = new JTextField();
    private final JTextField jTextField2 = new JTextField();
    private final JTextField jTextField3 = new JTextField();
    private final Trainer myTrainer;
    private final JTextField jTextField4 = new JTextField();
    private final JTextField jTextField5 = new JTextField();
    // Ende Attribute

    public GUI() {
        super();
        this.myTrainer = new Trainer();
        myTrainer.getController().readFile();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 448;
        int frameHeight = 578;
        setSize(frameWidth, frameHeight);
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (d.width - getSize().width) / 2;
        int y = (d.height - getSize().height) / 2;
        setLocation(x, y);
        setTitle("GUI");
        setResizable(false);
        Container cp = getContentPane();
        cp.setLayout(null);

        JLabel lVockabularytrainer = new JLabel();
        lVockabularytrainer.setBounds(120, 56, 214, 36);
        lVockabularytrainer.setText("Vockabulary trainer");
        lVockabularytrainer.setHorizontalTextPosition(SwingConstants.CENTER);
        lVockabularytrainer.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(lVockabularytrainer);
        JButton bCheck = new JButton();
        bCheck.setBounds(183, 179, 75, 25);
        bCheck.setText("Check");
        bCheck.setMargin(new Insets(2, 2, 2, 2));
        bCheck.addActionListener(this::bCheck_ActionPerformed);
        cp.add(bCheck);
        jTextField1.setBounds(56, 152, 150, 20);
        cp.add(jTextField1);
        jTextField2.setBounds(232, 152, 150, 20);
        cp.add(jTextField2);
        jTextField3.setBounds(208, 152, 22, 20);
        jTextField3.setVisible(true);
        jTextField3.setEditable(false);
        cp.add(jTextField3);
        jTextField4.setBounds(56, 264, 150, 20);
        cp.add(jTextField4);
        JButton bNewVocabulary = new JButton();
        bNewVocabulary.setBounds(160, 296, 115, 25);
        bNewVocabulary.setText("New Vocabulary");
        bNewVocabulary.setMargin(new Insets(2, 2, 2, 2));
        bNewVocabulary.addActionListener(this::bNewVocabulary_ActionPerformed);
        cp.add(bNewVocabulary);
        jTextField5.setBounds(232, 264, 150, 20);
        cp.add(jTextField5);
        JLabel lEnglishWord = new JLabel();
        lEnglishWord.setBounds(90, 126, 78, 20);
        lEnglishWord.setText("English Word");
        cp.add(lEnglishWord);
        JLabel lGermanWord = new JLabel();
        lGermanWord.setBounds(267, 125, 86, 20);
        lGermanWord.setText("German Word");
        cp.add(lGermanWord);
        JLabel lEnglishWord1 = new JLabel();
        lEnglishWord1.setBounds(88, 240, 78, 20);
        lEnglishWord1.setText("English Word");
        cp.add(lEnglishWord1);
        JLabel lGermanWord1 = new JLabel();
        lGermanWord1.setBounds(264, 240, 86, 20);
        lGermanWord1.setText("German Word");
        cp.add(lGermanWord1);
        JButton bSave = new JButton();
        bSave.setBounds(376, 508, 51, 25);
        bSave.setText("Save");
        bSave.setMargin(new Insets(2, 2, 2, 2));
        bSave.addActionListener(this::bSave_ActionPerformed);
        cp.add(bSave);
        // Ende Komponenten

        setVisible(true);
        this.myTrainer.getController().getVocList().append(new Card ("Hallo", "Hello", 0));
        this.myTrainer.getController().getVocList().append(new Card ("Auto", "Car", 0));
        this.myTrainer.getController().getVocList().toFirst();
        this.jTextField1.setText(myTrainer.getController().getVocList().getContent().getEn());
    } // end of public GUI
    // Anfang Komponenten

    // Anfang Methoden

    public static void main(String[] args) {
        new GUI();
    } // end of main

    public void bCheck_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        if (myTrainer.checkInput(this.jTextField2.getText(),false)){
            jTextField3.setBackground(Color.GREEN);
            this.myTrainer.getController().getVocList().next();
        }
        else {
            jTextField3.setBackground(Color.RED);
        } // end of if-else
        this.jTextField1.setText(myTrainer.getController().getVocList().getContent().getEn());
    } // end of bCheck_ActionPerformed

    public void bNewVocabulary_ActionPerformed(ActionEvent evt) {
        this.myTrainer.getController().getVocList().append(new Card(this.jTextField5.getText() ,this.jTextField4.getText(), 0));
    } // end of bNewVocabulary_ActionPerformed

    public void bSave_ActionPerformed(ActionEvent evt) {
        // TODO hier Quelltext einfügen
        myTrainer.getController().saveFile();
    } // end of bSave_ActionPerformed

    // Ende Methoden
} // end of class GUI
