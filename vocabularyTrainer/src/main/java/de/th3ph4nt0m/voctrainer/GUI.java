package de.th3ph4nt0m.voctrainer;

import de.th3ph4nt0m.voctrainer.model.Card;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

@SuppressWarnings("SpellCheckingInspection")
public class GUI extends JFrame {
    private final JTextField jTextField1 = new JTextField();
    private final JTextField jTextField2 = new JTextField();
    private final JTextField jTextField3 = new JTextField();
    private final Trainer myTrainer;
    private final JTextField jTextField4 = new JTextField();
    private final JTextField jTextField5 = new JTextField();

    public GUI() {
        super();
        this.myTrainer = new Trainer();
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        int frameWidth = 719;
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

        JLabel lVocabularytrainer1 = new JLabel();
        lVocabularytrainer1.setBounds(120, 88, 214, 36);
        lVocabularytrainer1.setText("Vocabulary trainer");
        lVocabularytrainer1.setHorizontalTextPosition(SwingConstants.CENTER);
        lVocabularytrainer1.setHorizontalAlignment(SwingConstants.CENTER);
        cp.add(lVocabularytrainer1);
        JButton bCheck = new JButton();
        bCheck.setBounds(192, 184, 67, 25);
        bCheck.setText("Check");
        bCheck.setMargin(new Insets(2, 2, 2, 2));
        bCheck.addActionListener(this::bCheck_ActionPerformed);
        cp.add(bCheck);
        jTextField1.setBounds(56, 152, 150, 20);
        cp.add(jTextField1);
        jTextField2.setBounds(240, 152, 150, 20);
        cp.add(jTextField2);
        jTextField3.setBounds(352, 96, 22, 20);
        cp.add(jTextField3);
        jTextField4.setBounds(76, 372, 150, 20);
        cp.add(jTextField4);
        JButton b = new JButton();
        b.setBounds(196, 406, 75, 25);
        b.setText("#");
        b.setMargin(new Insets(2, 2, 2, 2));
        b.addActionListener(this::b_ActionPerformed);
        cp.add(b);
        jTextField5.setBounds(242, 373, 150, 20);
        cp.add(jTextField5);
        JButton bZurucksetzen = new JButton();
        bZurucksetzen.setBounds(480, 136, 131, 25);
        bZurucksetzen.setText("Zurücksetzen");
        bZurucksetzen.setMargin(new Insets(2, 2, 2, 2));
        bZurucksetzen.addActionListener(this::bZurucksetzen_ActionPerformed);
        cp.add(bZurucksetzen);
        // Ende Komponenten

        setVisible(true);
        this.myTrainer.getController().getVocList().append(new Card ("Hallo", "Hello", 0));
        this.myTrainer.getController().getVocList().append(new Card ("Auto", "Car", 0));
        this.myTrainer.getController().getVocList().toFirst();
        this.jTextField1.setText(myTrainer.getController().getVocList().getContent().getEn());
    } // end of public GUI

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

    public void b_ActionPerformed(ActionEvent evt) {
        this.myTrainer.getController().getVocList().append(new Card(this.jTextField5.getText() ,this.jTextField4.getText(), 0));
        System.out.println("1");
        this.myTrainer.getController().saveFile();
        System.out.println("2");

    } // end of b_ActionPerformed

    public void bZurucksetzen_ActionPerformed(ActionEvent evt) {
        this.myTrainer.getController().getVocList().toFirst();
    } // end of bZurucksetzen_ActionPerformed

    // Ende Methoden
} // end of class GUI

