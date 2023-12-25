import java.util.Scanner;
import java.math.BigInteger;
import java.text.SimpleDateFormat;

public class prob1 {

    public static void main(String[] args) {

        // java.util package
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        // java.math package
        BigInteger bigNum = new BigInteger("12345678901234567890");
        System.out.println("Big Integer: " + bigNum);

        // java.text package
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Today's date: " + sdf.format(new java.util.Date()));
    }
}