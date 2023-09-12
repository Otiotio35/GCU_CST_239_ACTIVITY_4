package app;

/**
 * Represents a car with various attributes such as year, make, model, odometer, and engine liters.
 * * @version 09/09/2023
 * @author toafik otiotio
 */
public class Car {
    private int year;
    private String make;
    private String model;
    private int odometer;
    private double engineLiters;

    /**
     * Default constructor. Initializes the car with default values.
     */
    public Car() {
        this.year = 0;
        this.make = "";
        this.model = "";
        this.odometer = 0;
        this.engineLiters = 0.0;
    }

    /**
     * Parameterized constructor to initialize the car with specified values.
     *
     * @param year         The manufacturing year of the car.
     * @param make         The make/brand of the car.
     * @param model        The specific model of the car.
     * @param odometer     The number of miles/kilometers the car has driven.
     * @param engineLiters The volume of the car's engine in liters.
     */
    public Car(int year, String make, String model, int odometer, double engineLiters) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.odometer = odometer;
        this.engineLiters = engineLiters;
    }

    /**
     * Returns the manufacturing year of the car.
     *
     * @return The year of the car.
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets the manufacturing year of the car.
     *
     * @param year The year to set.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns the make/brand of the car.
     *
     * @return The make of the car.
     */
    public String getMake() {
        return make;
    }

    /**
     * Sets the make/brand of the car.
     *
     * @param make The make to set.
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * Returns the specific model of the car.
     *
     * @return The model of the car.
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the specific model of the car.
     *
     * @param model The model to set.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Returns the number of miles/kilometers the car has driven.
     *
     * @return The odometer reading.
     */
    public int getOdometer() {
        return odometer;
    }

    /**
     * Sets the number of miles/kilometers the car has driven.
     *
     * @param odometer The odometer value to set.
     */
    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    /**
     * Returns the volume of the car's engine in liters.
     *
     * @return The engine volume in liters.
     */
    public double getEngineLiters() {
        return engineLiters;
    }

    /**
     * Sets the volume of the car's engine in liters.
     *
     * @param engineLiters The engine volume to set.
     */
    public void setEngineLiters(double engineLiters) {
        this.engineLiters = engineLiters;
    }
}
