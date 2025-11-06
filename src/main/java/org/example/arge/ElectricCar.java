package org.example.arge;

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

    @Override
    public String startEngine() {
        String message = getClass().getSimpleName() + " -> Electric motor starting. Battery size: " + batterySize + " kWh";
        System.out.println(message);
        return message;
    }

    @Override
    public String drive() {
        String message = getClass().getSimpleName() + " -> Driving electric car. Avg Km per Charge: " + avgKmPerCharge;
        System.out.println(message);
        runEngine();
        return message;
    }
}
