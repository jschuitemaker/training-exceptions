package nl.axians;

import org.apache.commons.lang3.math.Fraction;

public class Example5 {

    public void start() throws Exception {
        try {
            methodA();
        } catch (ZeroBarsNotAllowedCheckedException e) {
            System.out.println("It didn't work out");
            e.printStackTrace();
            throw new Exception("Oh noo exception");
        }
    }

    private void methodA() throws ZeroBarsNotAllowedCheckedException {
        methodB();
    }

    private void methodB() throws ZeroBarsNotAllowedCheckedException {

        int numberOfFoos = 10, numberOfBars = 0 ;

        try {
            Fraction.getFraction(numberOfFoos, numberOfBars);
        } catch (ArithmeticException e) {
//            e.printStackTrace(); // do we need this? We handled it.
            String message = String.format("Foos was %s, but Bars was zero", numberOfFoos);
            System.out.println(message);
            throw new ZeroBarsNotAllowedCheckedException(message);
        }
    }

}