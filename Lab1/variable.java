class variable
{
    static int staticVariable ;
    public int instVariable ;

    public static void main(String[] args)
    {
        int localVariable = 38;
        variable var = new variable();
        variable.staticVariable = 50;
        var.instVariable = 100;
        System.out.println("Static Variable " + staticVariable);
        System.out.println("Insatnce Variable " + var.instVariable);
        System.out.println("Local Variable " + localVariable);
    }
}