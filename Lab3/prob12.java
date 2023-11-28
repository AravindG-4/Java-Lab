public class prob12 {
    private int value; // Instance variable

    // Constructor
    public prob12(int value) {
        this.value = value;
    }

    public int doubleValue() {
        return value * 2;
    }

    public static void main(String[] args) {
        prob12 obj = new prob12(5);

        // Invoking the instance method
        int doubledValue = obj.doubleValue();

        System.out.println("The doubled value is: " + doubledValue);
    }
}
