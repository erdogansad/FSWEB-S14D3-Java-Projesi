package Company.Build.CarTypes;

import Company.Build.CarSkeleton;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    protected String runEngine() {
        return "the car's engine is running (Type: " + this.getClass().getSimpleName() + ")";
    }

    @Override
    public String startEngine() {
        return "the car's engine is starting (Type: " + this.getClass().getSimpleName() + ", Average Km per Litre: "
                + this.getAvgKmPerLitre() + ", Cylinders: " + this.getCylinders() + ")";
    }

    @Override
    public String drive() {
        return runEngine();
    }
}
