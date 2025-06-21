package org.prog;

//TODO: Add second car, make it blue, make red car got to Kyiv, blue car go to Odessa
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
