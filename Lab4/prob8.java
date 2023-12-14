interface I1 {
    int num = 10;
}

class prob8 implements I1 {
    int num = 20;
    void display() {
        System.out.println(this.num);
    }
    public static void main(String[] args) {
        prob8 obj = new prob8();
        obj.display();
    }
}