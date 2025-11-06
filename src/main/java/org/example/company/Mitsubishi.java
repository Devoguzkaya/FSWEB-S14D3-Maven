package org.example.company;

public class Mitsubishi extends  Car {
    public  Mitsubishi(int cylinders, String name){
        super(cylinders,name);
    }
    @Override
    public String startEngine(){
        String message = getClass().getSimpleName() + " -> Mitsubishi's engine is starting.";
        System.out.println(message);
        return  message;
    }
    @Override
    public  String accelerate(){
        String message = getClass().getSimpleName() + " -> Mitsubishi is accelerating.";
        System.out.println(message);
        return message;
    }
    @Override
    public  String brake(){
        String message = getClass().getSimpleName() + " -> Mitsubishi is braking.";
        System.out.println(message);
        return message;
    }


}
