package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JOptionPane.*;

public class FoodOrder extends Component implements ActionListener{
    JFrame frame;
    JLabel l;
    JCheckBox cb1,cb2,cb3;
    JButton b;
    JOptionPane pane;

    FoodOrder(){
        frame = new JFrame("Food Order");
        l=new JLabel("Food Ordering System");
        l.setBounds(50,50,300,20);

        cb1=new JCheckBox("Pizza @ 100");
        cb1.setBounds(100,100,150,20);

        cb2=new JCheckBox("Burger @ 30");
        cb2.setBounds(100,150,150,20);

        cb3=new JCheckBox("Tea @ 10");
        cb3.setBounds(100,200,150,20);

        b=new JButton("Order");
        b.setBounds(100,250,80,30);
        b.addActionListener(this);

        frame.add(l);frame.add(cb1);frame.add(cb2);frame.add(cb3);frame.add(b);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "";

            if (cb1.isSelected()) {

                amount += 100;
                msg += "Pizza: 100\n";
            }
            if (cb2.isSelected()) {
                amount += 30;
                msg += "Burger: 30\n";
            }
            if (cb3.isSelected()) {
                amount += 10;
                msg += "Tea: 10\n";
            }

            //okno z wynikiem

            msg += "-----------------\n";
            pane = new JOptionPane();
            pane.showMessageDialog(frame, msg + "Total: " + amount);
        }

        public static void main(String[] args) {
            new FoodOrder();
        }
    }

