// Car.java
package com.driver;

public class Car extends Vehicle {
    private int currentGear;

    public Car(String name, int currentGear) {
        super(name);
        this.currentGear = currentGear;
    }

    public void changeGear(int newGear) {
        setCurrentGear(newGear);
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
