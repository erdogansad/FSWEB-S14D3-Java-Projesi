package Company.Build.CarTypes;

import Company.Build.CarSkeleton;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int batterySize, cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    protected String runEngine() {
        return "the car's engine is running (Type: " + this.getClass().getSimpleName() + ")";
    }

    @Override
    public String startEngine() {
        return "the car's engine is starting (Type: " + this.getClass().getSimpleName() + ", Battery Size: "
                + this.getBatterySize() + ", Average Km per Litre: " + this.getAvgKmPerLitre() + ", Cylinders: "
                + this.getCylinders() + ")";
    }

    @Override
    public String drive() {
        return runEngine();
    }
}
