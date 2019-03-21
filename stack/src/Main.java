package generic;

public class Main {
    public static void main(String[] args) {
        IntStack stos = new IntStack();
        stos.push(2);
        stos.push(3);
        System.out.println(stos.pop());
        System.out.println(stos.pop());
        stos.push(5);
        stos.push(7);
        //System.out.println(stos.pop());
        //System.out.println(stos.pop());

        Stack<String> stos2 = new Stack<>(10); //diamond operator
        stos2.push("Ala");
        stos2.push("Ola");
        System.out.println(stos2.getSize());
        System.out.println(stos2.pop());
        System.out.println(stos2.pop());
        System.out.println(stos2.pop());


    }
}
