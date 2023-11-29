package tech.dar.practice7.transport;

public class Bicycle extends Transport {

    public Bicycle(String name, String color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        setValues();
    }

    void setValues() {
        this.capacity = 1;
        this.wheelsAmount = 2;
    }

}

