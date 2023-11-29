package tech.dar.practice7.employee;

public abstract class Employee {
    String name;
    String position;
    int task;

    public void setTask(int task) {
        this.task = task;
    }

    public void displayInfo() {
        System.out.println();
        System.out.println(
                "Name: " + name + "\n" +
                        "Position: " + position + "\n" +
                        "Task: " + task
        );
    }
}
