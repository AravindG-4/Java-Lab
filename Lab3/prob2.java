public class prob2 {
    public static void main(String[] args) {
        // While loop
        int i = 0;
        System.out.println("While Loop");
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // Do-while loop
        int j = 0;
        System.out.println("Do-while Loop");
        do {
            System.out.println(j);
            j++;
        } while (j < 5);
        
        // For loop
        System.out.println("For Loop");
        for (i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        // For-each loop
        int[] numbers = {0, 1, 2, 3, 4};
        System.out.println("For-each Loop");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}