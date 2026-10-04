class Vehicle {

    String name;
    String model;
    int noOfTyres;

    Vehicle(String name, String model, int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }

    void startEngine() {
        System.out.println("Engine is starting of " + name + ": " + model);
    }

    void stopEngine() {
        System.out.println("Engine is stopping of " + name + ": " + model);
    }
}


class Car extends Vehicle {

    int noOfDoors;
    String transmissionType;

    Car(String name, String model, int noOfTyres,
        int noOfDoors, String transmissionType) {

        super(name, model, noOfTyres);

        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

    void startAC() {
        System.out.println("AC started of " + name);
    }
}


class Motorcycle extends Vehicle {

    String handleBarStyle;
    String suspensionType;

    Motorcycle(String name, String model, int noOfTyres,
               String handleBarStyle, String suspensionType) {

        super(name, model, noOfTyres);

        this.handleBarStyle = handleBarStyle;
        this.suspensionType = suspensionType;
    }

    void wheelie() {
        System.out.println("Motorcycle is doing Wheelie! " + name);
    }
}


public class Main {

    public static void main(String[] args) {

        Car c = new Car(
            "Maruti",
            "800",
            4,
            5,
            "Auto"
        );

        c.startEngine();
        c.startAC();
        c.stopEngine();

        System.out.println();

        Motorcycle m = new Motorcycle(
            "Honda",
            "Shine",
            2,
            "Straight",
            "Hydraulic"
        );

        m.startEngine();
        m.wheelie();
        m.stopEngine();
    }
}