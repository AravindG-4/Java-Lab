class prob2 {
	String name;
	int rollNo;
	prob2() {
		System.out.println("Object created using default constructor");
}
	prob2(String name, int rollno) {
		this.name = name;
		this.rollNo = rollno;
		System.out.println("Value assigned using parameterized constructor");
}
	prob2(prob2 obj) {
		this.name = obj.name;
		this.rollNo = obj.rollNo;
		System.out.println("Value copied using copy constructor");
}
	public static void main(String args[]) {
		prob2 obj1 = new prob2();
		prob2 obj2 = new prob2("Aravind", 11);
		prob2 obj3 = new prob2(obj2);
}
}