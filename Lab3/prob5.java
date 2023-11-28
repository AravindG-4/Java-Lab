public class prob5 {
    String name;
    int age;
    // Constructor
    prob5(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Default Constructor
    prob5() {
        this.name = "";
        this.age = 0;
    }
    // Setter method
    void set(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        System.out.println("CONSTRUCTOR");
        prob5 student1 = new prob5("John", 20);
        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);

        System.out.println("SETTER");
        prob5 student2 = new prob5();
        student2.set("Joe",25);
        System.out.println("Name: " + student2.name);
        System.out.println("Age: " + student2.age);

        System.out.println("REFERENCE VARIABLE");
        prob5 student3 = new prob5();
        student3.name = "Albert";
        student3.age = 40;
        System.out.println("Name: " + student3.name);
        System.out.println("Age: " + student3.age);
    }
}