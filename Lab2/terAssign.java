public class terAssign {
    public static void main(String[] args) {
        int a = 50;
        int b = 103;
        System.out.println((a<b) ? a:b );
        System.out.println("a+b : " + (a+=b));
        System.out.println("a-b : " + (a-=b));
        System.out.println("a*b : " + (a*=b));
        System.out.println("b/a : " + (b/=a));
        System.out.println("b%a : " + (b%=a));
    }
}
