package tech.dar.practice7.employee;

public class Main {
    public static void main(String[] args) {

        Manager john = new Manager("John", 4);

        Developer maharadja = new Developer("Maharadja", "Senior");
        Developer arman = new Developer("Arman", "Junior");

        Designer katya = new Designer("Ekaterina", "Interior");
        Designer aidos = new Designer("I-dos", "Exterior");

        maharadja.displayInfo();
        arman.displayInfo();
        katya.displayInfo();
        aidos.displayInfo();

        System.out.println("---");

        john.addSubordinate(maharadja);
        john.addSubordinate(arman);
        john.addSubordinate(katya);
        john.addSubordinate(aidos);

        john.setTasks();
        john.displayInfo();

    }
}
