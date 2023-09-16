package com.driver;
public class F1 extends Car {

    public F1(String name, boolean isManual) {
        super(name, 4, 2, 6, isManual, "Sports car", 1);
        // Use arbitrary values for parameters which are not mentioned
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        if (newSpeed <= 0) {
            newSpeed = 0;
            setCurrentGear(1); // Stop the car and set gear as 1
        } else if (newSpeed <= 50) {
            setCurrentGear(1);
        } else if (newSpeed <= 100) {
            setCurrentGear(2);
        } else if (newSpeed <= 150) {
            setCurrentGear(3);
        } else if (newSpeed <= 200) {
            setCurrentGear(4);
        } else if (newSpeed <= 250) {
            setCurrentGear(5);
        } else {
            setCurrentGear(6);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
