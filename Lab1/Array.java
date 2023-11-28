import java.util.Scanner;
public class Array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array's size");
        int size = sc.nextInt ();
        int arr[] = new int[size];
        for(int i = 0 ; i < size ; i++)
        {
            System.out.println("Enter array element at " + i + " index");
            arr[i] = sc.nextInt();
        }
        for (int i = 0 ; i < size ; i++)
        {
            System.out.println("Element " + i + " : " + arr[i]);
        }
    }
}