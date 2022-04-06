package at.satir.Calculator;

import javax.xml.transform.Result;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        ScientificCalculator sc1 = new ScientificCalculator();
        sc1.sin(85);
        double result = c1.multiply(10, 7);
        System.out.println(result);
    }
}
