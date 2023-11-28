public class objectInit 
{
    String name;
    int rollno;
    void initialize(String n, int r) 
    {
        name = n;
        rollno = r;
    }
    objectInit(String n, int roll)
    {
        name = n;
        rollno = roll;
    }
    void display() 
    {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollno);
    }
    public static void main(String[] args) {
        // Initializing object by reference variable
        objectInit student1 = new objectInit();
        student1.name = "Albert";
        student1.rollno = 40;
        student1.display();

        // Initializing object by method
        objectInit student2 = new objectInit();
        student2.initialize("Bob", 50);
        student2.display();

        // Initializing object by constructor
        objectInit student3 = new objectInit("Charlie", 60);
        student3.display();
    }

    objectInit() {
        // default constructor
    }
}
