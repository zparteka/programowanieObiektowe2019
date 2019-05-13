package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
import static javax.swing.JOptionPane.*;

public class FoodOrder extends Component implements ActionListener{
    JFrame frame, f2;
    JLabel l, l2;
    JCheckBox cb1,cb2,cb3;
    JTextField tf1, tf2, tf3;
    JButton b, b2;
    JOptionPane pane;

    FoodOrder(){
        frame = new JFrame("Food Order");
        l=new JLabel("Food Ordering System");
        l.setBounds(50,50,300,20);

        cb1=new JCheckBox("Pizza @ 100");
        cb1.setBounds(100,100,150,20);
        tf1 = new JTextField("1");
        tf1.setBounds(250, 100, 100, 30);

        cb2=new JCheckBox("Burger @ 30");
        cb2.setBounds(100,150,150,20);

        cb3=new JCheckBox("Tea @ 10");
        cb3.setBounds(100,200,150,20);

        b=new JButton("Order");
        b.setBounds(100,250,80,30);
        b.addActionListener(this);

        b2 = new JButton("?");
        b2.setBounds(250,250, 50, 30);
        b2.addActionListener(this);

        frame.add(l);frame.add(cb1);frame.add(cb2);frame.add(cb3);frame.add(b);  frame.add(tf1);frame.add(b2);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
        float amount = 0;
        String msg = "<html>";

        if (e.getSource() == b2) {
            pane = new JOptionPane();
            pane.showMessageDialog(frame, "Zaznacz co chcesz zamówić, napisz w jakiej ilości i kliknij 'Order'");
        }

        else {
            if (cb1.isSelected()) {

                String inp = tf1.getText();
                Integer input = Integer.parseInt(inp);
                Integer cost = input * 100;
                amount += cost;
                msg += inp + " Pizza: " + Integer.toString(cost) + "\n";
            }
            if (cb2.isSelected()) {
                amount += 30;
                msg += "Burger: 30\n";
            }
            if (cb3.isSelected()) {
                amount += 10;
                msg += "Tea: 10\n";
            }

            //okno z wynikiemi
            msg += "-----------------<br>" + "Total: " + amount;
            l2 = new JLabel(msg);
            l2.setBounds(50,50,300,20);
            f2 = new JFrame("Order");
            f2.add(l2);
            f2.setBounds(250,250,500,500);
            f2.setLayout(null);
            f2.setVisible(true);


            //pane = new JOptionPane();
            //pane.showMessageDialog(frame, msg + "Total: " + amount);
        }
    }
    public static void main(String[] args) {
        new FoodOrder();
    }
}

