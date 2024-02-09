package nl.axians;

public class Example1 {

    public void start() {
        methodA();
    }

    private void methodA() {
        methodB();
    }

    private void methodB() {
        int n = 0;
        int r = 100/n;
    }

}