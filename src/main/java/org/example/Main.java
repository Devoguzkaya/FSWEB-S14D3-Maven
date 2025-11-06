package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing CarSkeleton ---");
        CarSkeleton skeleton = new CarSkeleton("Generic", "A generic car skeleton");
        testCar(skeleton);

        System.out.println("\n--- Testing GasPoweredCar ---");
        CarSkeleton gasCar = new GasPoweredCar("Petrol Car", "A car that runs on petrol", 12.5, 4);
        testCar(gasCar);

        System.out.println("\n--- Testing ElectricCar ---");
        CarSkeleton electricCar = new ElectricCar("Electric Car", "A car that runs on electricity", 5.5, 75);
        testCar(electricCar);

        System.out.println("\n--- Testing HybridCar ---");
        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "A car that runs on both petrol and electricity", 20.0, 50, 4);
        testCar(hybridCar);
    }

    public static void testCar(CarSkeleton car) {
        System.out.println("Testing car: " + car.getName());
        System.out.println("Description: " + car.getDescription());
        car.startEngine();
        car.drive();
        System.out.println("--------------------");
    }
}