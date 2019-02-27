package bicycle;

import bicycle.Bicycle;

public class MountainBike extends Bicycle {

    final static int numberGears = 9;

    void changeGear(int newValue) {

        if (newValue <= numberGears) {
            gear = newValue;
        } else {
            System.err.println("Maximum number of gears equals to:" + numberGears);
        }
    }
}
