package figures;

public class Prism<T extends Fig2D> extends Figure implements threeDimensions {
    public T base;
    public double height;
    public Prism(T base, double height){
        this.base = base;
        this.height = height;

    }

    @Override
    public double calculateVolume() {
        double baseArea = base.calculateArea();
        double volume = baseArea * height;
        return volume;
    }

    @Override
    public double calculateSurface() {
        return 0; // trzeba doimplementować metody zwracające długości bokow dla figur 2d
    }
}
