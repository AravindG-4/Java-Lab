class Parent {
	static int a = 10;
	Parent(String b) {
		System.out.println("From parent class : " + b);
}
	void method() {
		System.out.println("Parent method");
}	
	Parent() {}
}
class child extends Parent {
	static int a = 20;
	child() {
		System.out.println("Child class");
}
	void method() {
		System.out.println("Child method");
}
	void display() {
		method();
		super.method();
		System.out.println(a);
		System.out.println(super.a);
}
}

class prob5 {
	public static void main(String args[]) {
		child obj = new child();
		obj.display();
}
}