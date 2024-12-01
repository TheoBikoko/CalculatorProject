public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Testing add: " + (calculator.add(2, 3) == 5));
        System.out.println("Testing subtract: " + (calculator.subtract(5, 3) == 2));
        System.out.println("Testing multiply: " + (calculator.multiply(2, 3) == 6));
        System.out.println("Testing divide: " + (calculator.divide(6, 3) == 2));
    }
}