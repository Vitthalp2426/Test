package ConstructorInheritance;

public class Parent extends GrandParent {

	
	int x; double d; String s;
	
	Parent () {
		this(3.154,"Velocity");
		x = 10; d = 1.4225486; s = "Super Keyword";
		System.out.println("1st Parent Constructor");
		System.out.println(x +" "+d+" "+s);
	}
	
	Parent (int q) {
		super();
		x = q;
		System.out.println("2nd Parent Constructor");
		System.out.println(x);
	}
	
	Parent (double f, String p) {
		this(125);
		d = f; s = p;
		System.out.println("3rd Parent Constructor");
		System.out.println(d+" "+s);
	}
	
	Parent (int a , float b){
		
		System.out.println("Parent Constructor = "+a+" "+b);
	}
	
	public static void main(String[] args) {
		
		Parent t = new Parent();
//		Parent t2 = new Parent(125,135);
		
	}
	
}
