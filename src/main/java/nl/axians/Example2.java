package nl.axians;

import org.apache.commons.lang3.math.Fraction;

public class Example2 {

    public void start() {
        methodA();
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