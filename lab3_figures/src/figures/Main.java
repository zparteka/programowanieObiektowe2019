package figures;

public class Main {
    public static void main(String[] args){
        Square kwadrat = new Square(4);
        double pole = kwadrat.calculateArea();
        System.out.println(pole);
        double perimeter = kwadrat.calculatePerimeter();
        System.out.println(perimeter);
    }
}
