package introduction;

import javax.swing.*;

//LABELS
public class Second {
    JFrame frame;

    public Second(){
        frame = new JFrame("Label Example"); //tworzymy obiekt klasy JFrame - czyli ramkę

        //BUTTONS
        JButton button = new JButton("Kliknij!"); //tworzymy nowy obiekt klasy JButton - czyli przycisk

        button.setBounds(175,175, 100, 100); //pozycja i rozmiar przycisku - x, y, szerokość, wysokość

        frame.add(button); //dodajemy przycisk do ramki

        JButton button1 = new JButton(new ImageIcon("/home/zparteka/Pulpit/button.jpg")); //sciezka do pliku
        button1.setBounds(350, 175, 318, 287);
        frame.add(button1);

        //LABEL EXAMPLE
        JLabel label1, label2;
        label1 = new JLabel("Guziczek pierwszy");
        label1.setBounds(175, 140, 200, 30);
        frame.add(label1);

        label2 = new JLabel("Guziczek drugi");
        label2.setBounds(350, 140, 200, 30);
        frame.add(label2);

        frame.setSize(1000,700); // rozmiar ramki

        frame.setLayout(null); // tym zajmiemy się później

        frame.setVisible(true); //chyba dość oczywiste

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new Second();
    }
}
