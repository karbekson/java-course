package tech.dar.practice13;

public class Prototype implements Cloneable {

    int num = 0;

    public void setNum(int n) {
        num = n;
    }

    public Prototype copy() {
        try {
            return (Prototype) this.clone();
        } catch (Exception ignored) {
        }
        return null;
    }

}
