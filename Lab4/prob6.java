public class prob6 {
    void printSum(int a,int b) {
        System.out.println("Sum "+(a+b));
    }
    void printSum(int a,int b, int c) {
        System.out.println("Sum "+(a+b+c));
    }

    public static void main(String[] args) {
        prob6 obj = new prob6();
        obj.printSum(1,2);
        obj.printSum(1,2,3);
    }
}
