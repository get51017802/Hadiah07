package GUI;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import javax.swing.*;

public class Grid extends JFrame {
    
    JTextField text = new JTextField();
    JButton b0 = new JButton("0");
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton btitik = new JButton(".");
    JButton bce = new JButton("CE");
    
public Grid(){
    super("Border Layout Berkasi");
    setSize(400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());
    add(text, BorderLayout.NORTH);
    JPanel pane = new JPanel();
    GridLayout family = new GridLayout(4,3,0,0);
    pane.setLayout(family);
    pane.add(b7);
    pane.add(b8);
    pane.add(b9);
    pane.add(b4);
    pane.add(b5);
    pane.add(b6);
    pane.add(b1);
    pane.add(b2);
    pane.add(b3);
    pane.add(b0);
    pane.add(btitik);
    pane.add(bce);
    add(pane);
    setVisible(true);}
        
        

public static void main(String[] args){
    Grid frame = new Grid();
    frame.setVisible(true);
        
    
}
    
    
}

