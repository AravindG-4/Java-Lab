class prob3 {
	String name;
	int rollNo;
	prob3() {
		System.out.println("Constructor1");
}
	prob3(String name, int rollno) {
		this.name = name;
		this.rollNo = rollno;
		System.out.println("Constructor2");
}
	prob3(String name) {
		this.name = name;
		System.out.println("Constructor3");
}
	public static void main(String args[]) {
		prob3 obj1 = new prob3();
		prob3 obj2 = new prob3("Aravind", 11);
		prob3 obj3 = new prob3("Aarav");
}
}