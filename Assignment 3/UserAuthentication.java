import java.util.Scanner;
class Invalid extends Exception {
    public Invalid(String message) {
        super(message);
    }
}

public class UserAuthentication {
    public static void authenticate(String username, String password) throws Invalid {
        if (password.length() < 8) {
            throw new Invalid("Password should be at least 8 characters long.");
        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) 
                hasUpperCase = true;
            else if (Character.isDigit(ch)) 
                hasDigit = true;
            else if (!Character.isLetterOrDigit(ch))
                hasSpecialChar = true;
        }

        if (!hasUpperCase) {
            throw new Invalid("Password should contain at least one uppercase character.");
        }

        if (!hasDigit) {
            throw new Invalid("Password should contain at least one numeric digit.");
        }

        if (!hasSpecialChar) {
            throw new Invalid("Password should contain at least one special character.");
        }

        System.out.println("User logged in successfully.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User name : ");
        String username = sc.nextLine();
        System.out.print("Password : ");
        String password = sc.nextLine();
        sc.close();

        try {
            authenticate(username, password);
        } catch (Exception e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }
}
