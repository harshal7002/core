package coree;

class cycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed = speed + increment;   
    }

    void applyBrakes(int decrement) {
         speed = speed - decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
class bicycle{
    public static void main(String args[]) {
    cycle hercules = new cycle();
    hercules.changeCadence(20);
    hercules.changeGear(3);
    hercules.speedUp(2);
    hercules.applyBrakes(5);
    hercules.printStates();
    }
}