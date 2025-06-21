package org.prog;


public class AutomationSession1 {

    public static void main(String[] args) {
        Car car = new Car();
        Car secondCar = new Car();
        car.color = "red";
        secondCar.color = "blue";
        car.destination = "Kyiv";
        secondCar.destination = "Odessa";
        car.goTo();
        secondCar.goTo();
    }
}
