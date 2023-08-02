package Company.Build;

public class CarSkeleton {
    private String name, description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return description;
    }

    protected String runEngine() {
        return "the car's engine is running";
    }

    public String startEngine() {
        return "the car's engine is starting";
    }

    public String drive() {
        return runEngine();
    }

}
