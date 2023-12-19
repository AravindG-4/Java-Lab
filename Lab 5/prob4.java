class A {
	A() {
		System.out.println("From class A");
}
}
class B extends A {
	B() {
		System.out.println("From class B");
}
}
class C extends A {
	C() {
		System.out.println("From class C");
}
}

class prob4 {
	public static void main(String args[]) {
		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
}
}