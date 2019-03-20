package figures;

public class Square extends Fig2D implements twoDimensions {
    double edge;

    public Square(int a){
        edge = a;
    }

    @Override
    public double calculateArea() {
        double area = Math.pow(edge, 2);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 4*edge;
        return perimeter;
    }
}
