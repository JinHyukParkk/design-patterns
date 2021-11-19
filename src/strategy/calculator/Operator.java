package strategy.calculator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MUTIPlY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);

    private String symbol;
    private BiFunction<Double, Double, Double> expression;

    Operator(String symbol, BiFunction<Double, Double, Double> expression) {
        this.symbol = symbol;
        this.expression = expression;
    }

    public static Operator of(String operator) {
        return Arrays.stream(values())
                .filter(op -> op.symbol.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 연산자"));

    }

    public double calculate(double num1, double num2) {
        return expression.apply(num1, num2);
    }
}
