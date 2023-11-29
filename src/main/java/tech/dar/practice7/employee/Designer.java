package tech.dar.practice7.employee;

public class Designer extends Employee {

    private String specificity;

    public Designer(String name, String specificity) {
        this.name = name;
        this.specificity = specificity;
        this.position = "Designer";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specificity: " + specificity);
    }

}
