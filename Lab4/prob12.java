interface A {
    void print();
}

interface B {
    void show();
}

interface C extends A, B {
    void doSomething();
}

class D implements C {
    public void print() {
        System.out.println("This is a print method of class D implementing interface C.");
    }

    public void show() {
        System.out.println("This is a show method of class D implementing interface C.");
    }

    public void doSomething() {
        System.out.println("This is a doSomething method of class D implementing interface C.");
    }
}

// Testing the program
class prob12 {
    public static void main(String[] args) {
        D obj = new D();
        obj.print();
        obj.show(); 
        obj.doSomething(); 
    }
}