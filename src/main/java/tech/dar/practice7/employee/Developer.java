package tech.dar.practice7.employee;

public class Developer extends Employee {

    private String level;

    public Developer(String name, String level) {
        this.name = name;
        this.level = level;
        this.position = "Developer";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level: " + level);
    }

}
