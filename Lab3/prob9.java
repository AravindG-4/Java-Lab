public class prob9 {
    int a,b;
    void operation(int a, int b, char operator) {
        switch(operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
    public static void main(String[] args) {
        prob9 obj = new prob9();
        obj.a = 10;
        obj.b = 20;
        obj.operation(obj.a, obj.b, '*');
    }

}
