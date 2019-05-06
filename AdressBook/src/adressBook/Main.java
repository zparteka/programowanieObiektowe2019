package adressBook;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("/home/zofia/Dokumenty/dydaktyka/programowanie_obiektowe/pliki/adresy.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        List<Person> adresses = new ArrayList<>();
        String st;

        while ((st = br.readLine()) != null) {
            System.out.println(st);

            String[] personData = st.split("\t");
            System.out.println(Arrays.toString(personData));

            Person person = new Person(personData[0], personData[1], personData[2], personData[3], personData[4]);
            adresses.add(person);

        }


        // printing personal data read from file
        for (int i=0; i < adresses.size(); i++){
            Person person = adresses.get(i);
            System.out.println("Name: " + person.name);
            System.out.println("Surname: " + person.surname);
            System.out.println("Adress: " + person.street + ", " + person.code + ", " + person.city);
    }

        //changing the adress
        Person jan = adresses.get(0);
        jan.changeAdress("Bonifacego 20", "02-970", "Warszawa");

        //adding new person
        Person newPerson = new Person("Halina", "Wolska", "Żerowskiego 88", "26-615", "Radom");
        adresses.add(newPerson);

        //saving to file

        BufferedWriter writer = new BufferedWriter(new FileWriter("/home/zofia/Dokumenty/dydaktyka/programowanie_obiektowe/pliki/adresy_modified.txt"));
        for (int i=0; i < adresses.size(); i++) {
            Person person = adresses.get(i);
            String str;
            str = person.name + "\t" + person.surname + "\t" + person.street + "\t" + person.code + "\t" + person.city + "\n";
            System.out.println(str);
            writer.write(str);
        }
        writer.close();

        //Jak to zrobić, zeby dodac tylko jedna linie na końcu starego pliku??


    }

}

