package nl.axians;

import org.apache.commons.lang3.math.Fraction;

public class Example4 {

    public void start() throws Exception {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Oh noo");
            e.printStackTrace();
            throw new Exception("Oh noo exception");
        }
    }

    private void methodA() {
        methodB();
    }

    private void methodB() {

        int numberOfFoos = 10 ;
        int numberOfBars = 0 ;

        try {
            Fraction.getFraction(numberOfFoos, numberOfBars);
        } catch (ArithmeticException e) {
            System.out.println("Calculation could not be executed");
            throw e;
        }
    }

}