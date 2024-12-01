public class Calculator {
        public int add(int a, int b) {
            return a + b;
        }
        public int subtract(int a, int b) {
            return a - b;
        }
        public int multiply(int a, int b) {
            return a * b;
        }
        public int divide(int a, int b) {
            try{
            return a / b;
            }catch(ArithmeticException e){
                System.out.println("Dividir entre 0 es impossible. Per tant, retornem el resultat 0");
                return 0;
            }
        }
        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            System.out.println("Addition: " + calculator.add(10, 5));
            System.out.println("Subtraction: " + calculator.subtract(10, 5));
            System.out.println("Multiplication: " + calculator.multiply(10, 5));
            System.out.println("Division: " + calculator.divide(10, 0));
        }
    }
