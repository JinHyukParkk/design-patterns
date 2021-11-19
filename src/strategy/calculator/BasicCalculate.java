package strategy.calculator;

public class BasicCalculate {

    private static double calculate(String operator, double result, double number) {
        if (operator.equals("*")) {
            result *= number;
        } else if (operator.equals("-")) {
            result -= number;
        } else if (operator.equals("+")) {
            result += number;
        } else if (operator.equals
                ("/")) {
            result /= number;
        }

        return result;
    }


    // 추상화, 다형성
    // 인터페이스
    // Map
    // Enum
    // 람다
    // 전략 패턴
}
