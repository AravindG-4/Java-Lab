class A {
	String inheritance;
}
class Single extends A {
	int inhNo;
	Single() {
		this.inheritance = "Single Inheritance";
}
}
class Multilevel extends Single {
	Multilevel() {
		this.inheritance = "Multilevel Inheritance";
		this.inhNo = 2;
}
}
class Hierarchial extends A {
	int inhNo;
	Hierarchial() {
		this.inheritance = "Hierarchical Inheritance";
		this.inhNo = 1;
}
}
class prob4 {
	public static void main(String args[]) {
		Single obj1 = new Single();
		System.out.println(obj1.inheritance);
	
		Multilevel obj2 = new Multilevel();
		System.out.println(obj2.inheritance);
		System.out.println(obj2.inhNo);             

		Hierarchial obj3 = new Hierarchial();
		System.out.println(obj3.inheritance);
		System.out.println(obj3.inhNo);
}
}