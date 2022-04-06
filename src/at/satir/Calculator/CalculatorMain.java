package at.satir.Calculator;


public class CalculatorMain {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        ScientificCalculator sc1 = new ScientificCalculator();
        RootCalculator rc1 = new RootCalculator();
        double r1 = rc1.root(16);
        double r2 = sc1.cos(90);
        double r3 = sc1.sin(90);

        System.out.println(r1);

        double sum = r1 + r2 + r3;
        System.out.println(sum);
    }
}
