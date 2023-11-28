public class javaConcepts 
{
    public static void main(String[] args)
    {
        int a = 30;
        long b = a;    //Widening
        float c = 40.404f;
        int d = (int) c;   //Narrowing (Typecasting)
        int e = 250;
        byte f = (byte) e;   //Overflow
        byte g = 95;   //Adding Lower Values
        byte i = 50;    //Adding Lower Values
        byte j = (byte) (g+i);  //Adding Lower Values
        System.out.println("After Windening " + b);
        System.out.println("After Narrowing " + d);
        System.out.println("After Overflow " + f);
        System.out.println("After Adding lower types " + j);
    }
}
