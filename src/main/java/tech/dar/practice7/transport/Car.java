package tech.dar.practice7.transport;

public class Car extends Transport {

    float engineVolume;

    public Car(String name, String color, int maxSpeed, float engineVolume) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
        setValues();
    }

    void setValues() {
        this.capacity = 5;
        this.wheelsAmount = 4;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine volume: " + engineVolume);
    }

}
