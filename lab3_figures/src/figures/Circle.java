package figures;

public class Circle extends Round implements twoDimensions{
    double radius;
    public Circle(double rad){
        radius = rad;
    }
    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    @Override
    public double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
