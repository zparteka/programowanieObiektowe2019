package figures;

public class Triangle extends Fig2D implements twoDimensions {

    int numberOfAngles = 3;
    double height;
    double base;
    double edge1;
    double edge2;
    double edge3;

    public Triangle(double a, double b){
        height = a;
        base = b;
    }

    public void defineEdges(double a, double b, double c){
        edge1 = a;
        edge2 = b;
        edge3 = c;
    }

    @Override
    public double calculateArea() {
        double area = (height*base)/2;
        return area;

    }

    @Override
    public double calculatePerimeter() {
        double perimeter = edge1 + edge3 + edge1;
        return perimeter;
    }
}
