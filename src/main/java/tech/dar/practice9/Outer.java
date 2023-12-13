package tech.dar.practice9;

public class Outer {

    private int number = 0;

    private class Inner {

        private int number = 1;

        void increment() {
            Outer.this.number++;
        }
    }
}
