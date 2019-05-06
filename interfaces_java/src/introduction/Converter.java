package introduction;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter implements ActionListener {
    JTextField input, output;
    JLabel label1, label2;
    JButton button1, button2;
    public Converter(){
        JFrame frame = new JFrame("Converter");

        input = new JTextField();
        input.setBounds(100, 100, 150, 30);
        frame.add(input);

        output = new JTextField();
        output.setBounds(100, 220, 150, 30);
        output.setEditable(false);
        frame.add(output);

        label1 = new JLabel("Input:");
        label1.setBounds(40, 100, 100, 30);
        frame.add(label1);

        label2 = new JLabel("Output:");
        label2.setBounds(40, 220, 100, 30);
        frame.add(label2);

        button1 = new JButton("KM→MI");
        button1.setBounds(100, 400, 150, 30);
        button1.addActionListener(this);
        frame.add(button1);

        button2 = new JButton("MI→KM");
        button2.setBounds(300, 400, 150, 30);
        button2.addActionListener(this);
        frame.add(button2);

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        String in = input.getText();
        Double a = Double.parseDouble(in);
        Double out=0.0;
        if(actionEvent.getSource()==button2){
            out = a*1.609344;

        }
        else if(actionEvent.getSource()==button1){
            out = a*0.621371192;
        }
        String result;
        result = String.valueOf(out);
        output.setText(result);
    }


public static void main(String[] args) {
        new Converter();
}}