package introduction;

import javax.swing.*;

//FRAME AND BUTTON
public class First {
    JFrame frame;

    public First(){
        frame = new JFrame(); //tworzymy obiekt klasy JFrame - czyli ramkę

        JButton button = new JButton("Kliknij!"); //tworzymy nowy obiekt klasy JButton - czyli przycisk

        button.setBounds(175,175, 100, 100); //pozycja i rozmiar przycisku - x, y, szerokość, wysokość

        frame.add(button); //dodajemy przycisk do ramki

        JButton button1 = new JButton(new ImageIcon("/home/zofia/Obrazy/Zaznaczenie_40.png"));
        button1.setBounds(350, 175, 318, 287);
        frame.add(button1);

        frame.setSize(1000,700); // rozmiar ramki

        frame.setLayout(null); // tym zajmiemy się później

        frame.setVisible(true); //chyba dość oczywiste
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new First();
    }
}
