package session4;

public class constructor {
	
	
	public constructor() {
		System.out.println("Default constuctor");
		
	}
	
	public constructor(String name, String age) {
	
	System.out.println("Name:" +name);
	System.out.println("Age:" + age);
    System.out.println("Paramerized constructor");
	
	}
	
	public int sum (int a,int b) {
		int res = a+b;
		return res;
	}
 
	public static void main(String[] args) {
		constructor ce = new constructor();
		constructor cx = new constructor("Reshma","18");
		System.out.println(ce.sum(67, 17));
		
	}
}
