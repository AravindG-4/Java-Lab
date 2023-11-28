class jaggedArr 
{
    public static void main(String[] args) 
    {
        int[][] jaggArr = {
            new int[] {10},
            new int[] {20, 30},
            new int[] {40,50,60}
                };
        for(int i = 0 ; i < jaggArr.length ; i++)
        {
            for(int j = 0 ; j < jaggArr[i].length ; j++)
            {
                System.out.println("Element " + j + " of Array " + i + " : " + jaggArr[i][j]);
            }
        }
    }
}
