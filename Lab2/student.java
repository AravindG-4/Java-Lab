class student
{
    String name;
    int rollno;
    public static void main(String[] args) 
    {
        student object = new student();
        object.name = "Albert";
        object.rollno = 40;
        System.out.println("Name : " + object.name);
        System.out.println("Roll No : " + object.rollno);
    }
}