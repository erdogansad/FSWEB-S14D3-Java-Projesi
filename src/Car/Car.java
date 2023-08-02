package Car;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders, wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car Name: " + this.name + "\nCylinders: " + this.cylinders;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return this.name.equals(car.getName()) && this.cylinders == car.getCylinders();
        }
        return false;
    }

    public String startEngine() {
        return "the car's engine is starting (Class: " + this.getClass().getSimpleName() + ")";
    }

    public String accelerate() {
        return "the car is accelerating (Class: " + this.getClass().getSimpleName() + ")";
    }

    public String brake() {
        return "the car is braking (Class: " + this.getClass().getSimpleName() + ")";
    }

}
