package me.samuel;

public class Car {
    private String carModel;
    private String carColor;
    private int speed;

    public Car() {
        System.out.println("This is the constructor.");
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Car (String color, String model){
        this.carColor = color;
        this.carModel = model;
    }

    public String start(){
        return "The " + carColor + " " + carModel + " " + "is starting.";
    }

    public String accelerate(){
        return "The " + carColor + " " + carModel + " " + "is accelerating.";
    }

    public String go(){
        return "The " + carColor + " " + carModel + " " + "is going at " + this.getSpeed() + " MPH.";
    }

    public String stopEmissions(){
        return "The " + carColor + " " + carModel + " " + "has stopped to have its emissions checked.";
    }

    public String passEmissions(){
        return "The " + carColor + " " + carModel + " " + "passes its emission test.";
    }

    public String stop(){
        return "The " + carColor + " " + carModel + " " + "slows to a stop.";
    }

    public String pass(Car passed){
        return "The " + carColor + " " + carModel + " " + "just passed the " + passed.carColor + " " + passed.carModel + ".";
    }


}