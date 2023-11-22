package tech.dar.practice6;

public class MathUtil {

    public static int counter;

    public int max(int a, int b) {
        counter++;
        return a > b ? a : b;
    }

}
