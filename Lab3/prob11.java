public class prob11 {

    static int Square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int number = 5;
        int square = Square(number);
        System.out.println("The square of " + number + " is: " + square);
    }
}
