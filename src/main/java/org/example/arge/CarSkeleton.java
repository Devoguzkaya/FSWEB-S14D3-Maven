package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(){
        this("Unknown", "No description provided.");
    }
    public  CarSkeleton(String name, String description) {
        this.name=name;
        this.description=description;
    }

    public String getName(){
        return name;
    }
    public  String getDescription(){
        return  description;
    }
    public String startEngine(){
        String message = getClass().getSimpleName()+" -> starting engine.";
        System.out.println(message);
        return message;
    }
    public String drive(){
        String message = getClass().getSimpleName()+" -> driving.";
        System.out.println(message);
        runEngine();
        return message;
    }
    protected String runEngine(){
        String message = getClass().getSimpleName()+" -> engine is running.";
        System.out.println(message);
        return message;
    }
}
