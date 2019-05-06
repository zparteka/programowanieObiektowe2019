package adressBook;

public class Person {
    String name;
    String surname;
    String street;
    String code;
    String city;


    public Person(String name, String surname, String street, String code, String city){
        this.name = name;
        this.surname = surname;
        this.street = street;
        this.code = code;
        this.city = city;

    }

    public void changeAdress(String newStreet, String newCode, String newCity){
        this.street = newStreet;
        this.code = newCode;
        this.city = newCity;
    }
}
