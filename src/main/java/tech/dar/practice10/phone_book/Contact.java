package tech.dar.practice10.phone_book;

public class Contact {

    private static Integer idCounter = 1;
    private Integer id;
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.id = generateId();
        this.name = name;
        this.phone = phone;
    }

    public int generateId() {
        return idCounter++;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void print() {
        System.out.println("ID: " + id + "; Name: " + name + "; Phone: " + phone);
    }
}
