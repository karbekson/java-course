package tech.dar.practice7.transport;

public class Truck extends Transport {

    float maxLoad;

    public Truck(String name, String color, int maxSpeed, float maxLoad) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.maxLoad = maxLoad;
        setValues();
    }

    void setValues() {
        this.capacity = 3;
        this.wheelsAmount = 10;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Max load: " + maxLoad);
    }

}
