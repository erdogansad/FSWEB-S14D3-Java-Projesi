package Company.Build.CarTypes;

import Company.Build.CarSkeleton;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerCharge, int batterySize) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }

    protected String runEngine() {
        return "the car's engine is running (Type: " + this.getClass().getSimpleName() + ")";
    }

    @Override
    public String startEngine() {
        return "the car's engine is starting (Type: " + this.getClass().getSimpleName() + ", Battery Size: "
                + this.getBatterySize() + ", Average Km per Charge: " + this.getAvgKmPerCharge() + ")";
    }

    @Override
    public String drive() {
        return runEngine();
    }
}
