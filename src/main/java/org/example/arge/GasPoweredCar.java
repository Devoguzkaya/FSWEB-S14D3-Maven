package org.example.arge;

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

    @Override
    public String startEngine() {
        String message = getClass().getSimpleName() + " -> Gas engine starting. Cylinders: " + cylinders;
        System.out.println(message);
        return message;
    }

    @Override
    public String drive() {
        String message = getClass().getSimpleName() + " -> Driving gas-powered car. Avg Km per Litre: " + avgKmPerLitre;
        System.out.println(message);
        runEngine(); // Call runEngine from CarSkeleton
        return message;
    }
}
