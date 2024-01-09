// Parent class - Bank
class Bank {
    void Info() {
        System.out.println("This is a Bank.");
    }
}

// Child class 1 - SavingsAccount
class SavingsAccount extends Bank {
    void Type() {
        System.out.println("This is a Savings Account.");
    }
}

// Child class 2 - CheckingAccount
class CheckingAccount extends Bank {
    void Type() {
        System.out.println("This is a Checking Account.");
    }
}

// Main class demonstrating hierarchical inheritance
public class BankingApplication {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        CheckingAccount checking = new CheckingAccount();

        savings.Info(); // Inherited method from Bank class
        savings.Type(); // Method specific to SavingsAccount

        System.out.println(); // Adding a line break for clarity

        checking.Info(); // Inherited method from Bank class
        checking.Type(); // Method specific to CheckingAccount
    }
}
