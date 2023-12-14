interface Test {
    int value = 10;
}
class prob9 implements Test {
    public static void main(String[] args) {
        Test.value = 20; // this line will cause a compile-time error
    }
}