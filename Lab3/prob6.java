class prob6 {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Anonymous object
        new prob6() {{
            setName("Aravind");
            setAge(20);
            display();
        }};
    }
}
