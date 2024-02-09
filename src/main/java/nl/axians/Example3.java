package nl.axians;

import org.apache.commons.lang3.math.Fraction;

public class Example3 {

    public void start() {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Oh noo");
        }
    }

    private void methodA() {
        methodB();
    }

    private void methodB() {

        int numberOfFoos = 10 ;
        int numberOfBars = 0 ;
        Fraction.getFraction(numberOfFoos, numberOfBars);
    }

}