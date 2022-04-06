package at.satir.Calculator;

public class ScientificCalculator extends Calculator {

    public void sin(double number) {
        double result = Math.sin(number);
        System.out.println(result);
    }

    public void cos(double number) {
        double result = Math.cos(number);
        System.out.println(result);
    }
}
