public class prob4 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // Nested if-else statement
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The biggest number is " + num1);
            } 
            else {
                System.out.println("The biggest number is " + num3);
            }
        } 
        else {
            if (num2 > num3) {
                System.out.println("The biggest number is " + num2);
            } 
            else {
                System.out.println("The biggest number is " + num3);
            }
        }

        // If-else-if ladder
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The biggest number is " + num1);
        } 
        else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The biggest number is " + num2);
        } 
        else {
            System.out.println("The biggest number is " + num3);
        }
    }
}