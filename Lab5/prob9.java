import java.util.Scanner;
import java.lang.*;
class KitchenException extends Exception {
    KitchenException(String errorMessage) {
        super(errorMessage);
    }
}
public class prob9 {
    public static void main(String[] args) {
        try 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER THE KITCHEN OBJECTS");
            String A = sc.next();
            if (A.equalsIgnoreCase("null")) 
            {
                throw new KitchenException("Custom Exception: OBJECT CAN'T BE NULL");
            }
            if(A.equalsIgnoreCase("powder"))
            {
                 throw new KitchenException("Custom Exception: POWDER NOT AVAILABLE");
            }
            else
            {
                System.out.println(A+":AVAILABLE");
            }
        } 
        catch (KitchenException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
