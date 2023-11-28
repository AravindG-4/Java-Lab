class mainInAnother 
{
    String name;
    int rollno;    
}

class student
{
    public static void main(String[] args) 
    {
        mainInAnother object = new mainInAnother();
        object.name = "Albert";
        object.rollno = 40;
        System.out.println("Name : " + object.name);
        System.out.println("Roll No : " + object.rollno);
    }
}
