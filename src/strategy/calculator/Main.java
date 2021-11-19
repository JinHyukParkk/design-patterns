package strategy.calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println(Operator.of("*").calculate(1, 2));
    }
}
