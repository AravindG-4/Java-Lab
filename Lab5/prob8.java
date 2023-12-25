public class prob8 {

    public static void main(String[] args) {

        // ArithmeticException
        try {
            int a = 5;
            int b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // NullPointerException
        try {
            String str = null;
            System.out.println("Length: " + str.length());
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // NumberFormatException
        try {
            String num = "Abcd";
            Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Parent Exception: " + e.getMessage());
        }


        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            System.out.println("Element at index 10: " + arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}