package ConstructorInheritance;

public class GrandParent {

	
	int i , j, k;		
	
	GrandParent() {
		this(20);
		i=10; j=20; k=30;	
		System.out.println(i + " "+ j+" "+k);
	}
	
	GrandParent(int p) {
		
		System.out.println("Grand Parent = "+p);		
	}
	
	public static void main(String[] args) {
		
		GrandParent g = new GrandParent();
		
	}
}
