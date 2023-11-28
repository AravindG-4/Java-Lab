public class jaggInit 
{
    public static void main(String[] args)
    {
    int jaggArr[][] = new int [3] [];   //Initializing jagged array
    jaggArr [0] = new int [1];
    jaggArr [1] = new int [2];
    jaggArr [2] = new int [3];
    int element = 1;
    for(int i=0;i<jaggArr.length; i++)
    {
        for(int j=0; j<jaggArr[i].length;j++)
            jaggArr[i][j] = element++;
    }
    for(int i=0;i<jaggArr.length; i++)
    {
        for(int j = 0; j<jaggArr[i].length; j++)
            System.out.println("Element " + j + " of Array " + i + " : " + jaggArr[i][j]);
    }
    }
}