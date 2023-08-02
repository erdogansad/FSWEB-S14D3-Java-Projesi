package Car.Brands;

import Car.Car;

public class Mitsubishi extends Car {
    public Mitsubishi(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "the car's engine is starting (Class: " + this.getClass().getSimpleName() + ")";
    }

    @Override
    public String accelerate() {
        return "the car is accelerating (Class: " + this.getClass().getSimpleName() + ")";
    }

    @Override
    public String brake() {
        return "the car is braking (Class: " + this.getClass().getSimpleName() + ")";
    }
}
