class Parent {
	int num = 10
} 
class child1 extends Parent {
	num = 20;
}
class child2 extends Parent{
	num = 30;
}
class Multiple extends child1,child {
	Multiple() {
		System.out.println("Success");
}
}
class prob5 {
	public static void main(String args[]) {
		Multiple obj1 = new Multiple();
}
}