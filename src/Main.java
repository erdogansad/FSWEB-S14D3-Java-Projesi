import Car.Car;
import Car.Brands.Ford;
import Car.Brands.Holden;
import Car.Brands.Mitsubishi;
import Company.Build.CarSkeleton;
import Company.Build.CarTypes.ElectricCar;
import Company.Build.CarTypes.GasPoweredCar;
import Company.Build.CarTypes.HybridCar;

public class Main {

    private static void runApp() {
        System.out.println("---------- Base Car ----------");
        Car car = new Car("Base car", 8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        System.out.println("\n");

        System.out.println("---------- Mitsubishi ----------");
        Car mitsubishi = new Mitsubishi("Outlander VRX 4WD", 6);
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());
        System.out.println("\n");

        System.out.println("---------- Ford ----------");
        Car ford = new Ford("Ford Falcon", 6);
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());
        System.out.println("\n");

        System.out.println("---------- Holden ----------");
        Car holden = new Holden("Holden Commodore", 6);
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
        System.out.println("\n");

        System.out.println("---------- Company ----------");
        CarSkeleton carSkeleton = new CarSkeleton("Mitsubishi", "Outlander VRX 4WD");
        System.out.println("Name: " + carSkeleton.getName());
        System.out.println("Description: " + carSkeleton.getDescription());
        System.out.println(carSkeleton.startEngine());
        System.out.println(carSkeleton.drive());
        System.out.println("\n");

        ElectricCar electricCar = new ElectricCar("Tesla", "Model S", 4, 100);
        System.out.println("Name: " + electricCar.getName());
        System.out.println("Description: " + electricCar.getDescription());
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());
        System.out.println("\n");

        GasPoweredCar gasPoweredCar = new GasPoweredCar("Ford", "Falcon", 8.5, 6);
        System.out.println("Name: " + gasPoweredCar.getName());
        System.out.println("Description: " + gasPoweredCar.getDescription());
        System.out.println(gasPoweredCar.startEngine());
        System.out.println(gasPoweredCar.drive());
        System.out.println("\n");

        HybridCar hybridCar = new HybridCar("Toyota", "Prius", 4.5, 4, 100);
        System.out.println("Name: " + hybridCar.getName());
        System.out.println("Description: " + hybridCar.getDescription());
        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());
        System.out.println("\n");
    }

    public static void main(String[] args) {
        runApp();
    }
}