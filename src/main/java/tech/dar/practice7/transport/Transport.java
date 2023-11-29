package tech.dar.practice7.transport;

public abstract class Transport {

    String name;
    String color;
    int maxSpeed;
    int wheelsAmount;
    int capacity;

    public void displayInfo() {
        System.out.println();
        System.out.println(
                "Name: " + name + "\n" +
                        "Color: " + color + "\n" +
                        "Max speed: " + maxSpeed + "\n" +
                        "Wheels amount: " + wheelsAmount + "\n" +
                        "Capacity: " + capacity
        );
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

}