class Parent {
	static int num = 10;
} 
class child1 extends Parent {
	static int num = 20;
}
class child2 extends Parent{
	static int num = 30;
}
class Multiple extends child1,child2 {
	Multiple() {
		System.out.println("Success");
}
}
class prob5 {
	public static void main(String args[]) {
		Multiple obj1 = new Multiple();
}
}