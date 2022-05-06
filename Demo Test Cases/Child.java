package ConstructorInheritance;

public class Child extends Parent{

	Child () {
		super(25);
		int x = 30;
		
		System.out.println("Parent x = "+super.x);
		System.out.println("Child x = "+x);
	}
	
	Child (float c) {
		this();
		System.out.println("Child float c = "+x);
		
	}
	
	Child (int a){
		super(20);
	}
	
	Child (int b, float f) {
		super(125,135.134f);
	}
	
	public static void main(String[] args) {
		
		Child a = new Child(3.145f);
		
	}
}
