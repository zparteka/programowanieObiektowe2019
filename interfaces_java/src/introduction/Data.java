package introduction;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

//PZYKŁAD Z ACTION LISTENER
public class Data implements ActionListener {
    JTextField data;
    JButton button;
    public Data(){
        JFrame frame = new JFrame("Podaj datę");
        data = new JTextField();
        data.setBounds(50, 50, 150, 30);
        frame.add(data);

        button = new JButton("Który dzisiaj?");
        button.setBounds(50, 200, 150,50);
        button.addActionListener(this);
        frame.add(button);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if(event.getSource()==button){
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date date = new Date();
            data.setText(dateFormat.format(date));
        }
    }

    public static void main(String[] args) {
        new Data();
    }
}
