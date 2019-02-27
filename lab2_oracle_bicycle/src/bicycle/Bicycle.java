package bicycle;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;
    static int numberGears = 6; //static - kazdy rower bedzie mial max 6 biegow; final - oznacza, ze nigdy nie zostanie ona zmieniona

    void changeCadence(int newValue){
        cadence = newValue;
    }

    void changeGear(int newValue) {

        if (newValue <= numberGears) {
            gear = newValue;
        } else {
            System.err.println("Maximum number of gears equals to:" + numberGears);
        }
    }
    void speedUp(int increment){
        speed = speed + increment;
    }

    void applyBreaks(int decrement){
        speed = speed - decrement;
    }

    void printStates(){
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}

