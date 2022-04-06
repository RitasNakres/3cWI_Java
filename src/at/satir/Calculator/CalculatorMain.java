package at.satir.Calculator;


public class CalculatorMain {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        ScientificCalculator sc1 = new ScientificCalculator();
        RootCalculator rc1 = new RootCalculator();
        rc1.root(9);
        sc1.cos(90);
        sc1.sin(90);


    }
}
