import java.util.Arrays;

class prob3 {

    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        System.out.println("1. length(): " + str.length());
        System.out.println("2. charAt(): " + str.charAt(1));
        System.out.println("3. substring(): " + str.substring(1, 4));
        System.out.println("4. replace(): " + str.replace('a', 'e'));
        System.out.println("5. split(): " + Arrays.toString(str.split(" ")));
    }
}