interface A {
    void print();
}

interface B {
    void show();
}

class C implements A, B {
    public void print() {
        System.out.println("This is a print method of class C implementing interface A.");
    }

    public void show() {
        System.out.println("This is a show method of class C implementing interface B.");
    }
}

// Testing the program
class prob11 {
    public static void main(String[] args) {
        C obj = new C();
        obj.print(); 
        obj.show(); 
    }
}