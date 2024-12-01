public class Calculator {
        public int add(int a, int b) { return a + b;
        }
        public int subtract(int a, int b) { return a - b;
        }
        public static void main(String[] args) {
            Calculator calculator = new Calculator(); System.out.println("Addition: " + calculator.add(10, 5));
            System.out.println("Subtraction: " + calculator.subtract(10, 5));
        }
    }
