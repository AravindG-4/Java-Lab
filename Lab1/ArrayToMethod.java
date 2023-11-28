public class ArrayToMethod 
{
    public static void printArray(int[] arr, int size)
    {
        int i = 0;
        while(i < size)
        {   System.out.println("Element " + i + " : " + arr[i]);
            i++;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5};
        int size = 5;
        printArray(arr, size);
    }    
}
