interface I1 {
    void hello();
}

interface I2 {
    void World();
}

class prob7 implements I1, I2 {
    public void hello() {
        System.out.println("Hello");
    }

    public void World() {
        System.out.println("World");
    }

    public static void main(String[] args) {
        prob7 obj = new prob7();
        obj.hello();
        obj.World();
    }
}
