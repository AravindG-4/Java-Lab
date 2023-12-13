public class prob12 {
    private int value; // Instance variable

    // Setter
    public void setVal(int value) {
        this.value = value;
    }

    //Getter
    public int getVal() {
        return value;
    }

    public static void main(String[] args) {
        prob12 obj = new prob12();
        obj.setVal(5);
        int result = obj.getVal();

        System.out.println("The value is: " + result);
    }
}
