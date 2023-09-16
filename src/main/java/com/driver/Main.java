package com.driver;

public class Main {
    public static void main(String[] args) {
        // Create a Vehicle named "MyVehicle"
        System.out.println("creating Vehical");
        Vehicle myVehicle = new Vehicle("MyVehicle");
        myVehicle.move(30, 45);
        myVehicle.steer(10);
        myVehicle.stop();

        // Create a Car named "MyCar" with an initial gear of 3
        System.out.println("creating Car");
        Car myCar = new Car("MyCar", 3);
        myCar.changeGear(2);
        myCar.changeSpeed(50, 90);

        // Create an F1 car named "MyF1" with an initial gear of 4
        System.out.println("creating F1");
        F1 myF1 = new F1("MyF1", 4);
        myF1.accelerate(60);
        myF1.accelerate(-40);

        // Create a Boat named "MyBoat" with a capacity of 10
        System.out.println("creating Boat");
        Boat myBoat = new Boat("MyBoat", 10);
        System.out.println("Boat Name: " + myBoat.getVehicleName());
        System.out.println("Boat Capacity: " + myBoat.getVehicleCapacity());
    }
}
