package tech.dar.practice7.employee;

public class Manager extends Employee {

    private Employee[] subordinates;
    private int employeeCounter = 0;

    public Manager(String name, int subordinatesSize) {
        this.name = name;
        this.position = "Manager";
        this.subordinates = new Employee[subordinatesSize];
    }

    public void addSubordinate(Employee employee) {
        if (employeeCounter == subordinates.length) {
            System.out.println("Max number of employees!!!");
        } else {
            subordinates[employeeCounter] = employee;
            employeeCounter++;
            System.out.println("Added new employee: " + employee.name);
        }
    }

    public void setTasks() {
        for (Employee employee : subordinates) {
            employee.setTask((int) (Math.random() * 10));
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subordinates max size: " + subordinates.length);
        System.out.println("Subordinates amount: " + employeeCounter);

        for (int i = 0; i < subordinates.length; i++) {
            System.out.println(
                    "Subordinate " + (i + 1) + ": "
                            + subordinates[i].name
                            + "\nTask: " + subordinates[i].task
            );
        }
    }

}
