package tech.dar.practice9;

public class Temperature {

    private double value;
    private char scale;

    public Temperature() {
        value = 0;
        scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        scale = 'C';
    }

    public Temperature(char scale) {
        this.scale = scale;
        this.value = 0;
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public char getScale() {
        return scale;
    }

    public void setValueAndScale(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public void setTemperature(char scale) {
        this.scale = scale;
    }

    public double degreesC() {
        if (scale == 'F')
            return value;
        return 5 * (value - 32) / 9;
    }

    public double degreesF() {
        if (scale == 'C')
            return value;
        return 9 * (value / 5) + 32;
    }

}
