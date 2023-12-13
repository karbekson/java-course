package tech.dar.practice9;

/*
    Vehicle car = new Vehicle();
    car.startEngine();
 */
public class Vehicle {

    private int speed;
    private Engine engine;

    public void startEngine() {
        speed = 0;
        Engine engine = new Engine();
        engine.run((int) (Math.random() * 100));
    }

    interface Runnable {
        void run(int x);
    }

    class Engine implements Runnable {

        @Override
        public void run(int x) {
            speed += x;
            System.out.println("Running speed: " + speed);
        }
    }

}
