public class prob7 {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            int result = a / b; // This will throw an exception since we are trying to divide by zero
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("End of the program.");
        }
    }
}