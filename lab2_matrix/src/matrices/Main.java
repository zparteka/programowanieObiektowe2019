package matrices;

public class Main {
    public static void main(String[] args) {
        Matrix m = new Matrix(3,4);
        m.Fill();
        m.Print();
        int even = m.Even();
        int odd = m.Odd();
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
        //TODO
        //Average
        //Optimize even/odd numbers if/else
        //Greater than (argument)
        //zerowanie macierzy
        //testy do całości
        //dodatkowo - tworzenie drugiej macierzy i sumowanie/odejmowanie macierzy
       int odd1 =  m.Odd1();
        System.out.println("Odd1 numbers: " + odd1);
    }
}
