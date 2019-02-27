package bicycle;

import bicycle.Bicycle;

public class Main{
    public static void main(String[] args) {

        //Create two different bicycle objects

        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        MountainBike bike3 = new MountainBike();

        //invoke methods on those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();

        bike3.changeCadence(50);
        bike3.speedUp(10);
        bike3.changeGear(9);
        bike3.printStates();
    }
}