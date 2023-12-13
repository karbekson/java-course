package tech.dar.practice9;

public class Average {

    // avg(1, 2, 3, 4, 5);
    public double avg(int ... args) {
        double sum = 0;
        for (int i : args) {
            sum += i;
        }
        return sum / args.length;
    }

}
