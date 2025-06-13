@FunctionalInterface
public interface CalculatorWithLambda {
    int operate(int a, int b);
}

    class Mainsss {
    public static void calculate(int a, int b, CalculatorWithLambda calc) {
        System.out.println("Result: " + calc.operate(a, b));
    }

    public static void main(String[] args) {
        CalculatorWithLambda add = (a, b) -> a + b;
        CalculatorWithLambda subtract = (a, b) -> a - b;
        CalculatorWithLambda multiply = (a, b) -> a * b;
        CalculatorWithLambda divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        };

        calculate(10, 5, add);       // Addition
        calculate(10, 5, subtract);  // Subtraction
        calculate(10, 5, multiply);  // Multiplication
        calculate(10, 5, divide);    // Division
    }
}