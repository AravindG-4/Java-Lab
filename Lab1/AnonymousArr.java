class AnonymousArr
{
    public static void printArray(int arr[], int size)
    {
        int i = 0;
        while(i < size)
        {   
            System.out.println("Element " + i + " : " + arr[i]);
            i++;
        }
    }
    public static void main(String[] args)
    {
        int size = 5;
        printArray(new int[]{10,20,30,40,50}, size);
    }
}