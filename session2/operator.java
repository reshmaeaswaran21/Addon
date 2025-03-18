package session2;

public class operator {
	
	public static void main(String[] args) {
		int a = 5,b = 9;
		//Arithmitic operator
		System.out.println("Addition:" +(a+b));
		System.out.println("Subtraction:" +(a-b));
		System.out.println("Multiplication:" +(a*b));
		System.out.println("Division:" +(a/b));
		//Relational
		System.out.println("Equal to:" +(a==b));
		System.out.println("Not equal to:" +(a!=b));
		System.out.println("Lessthan:" +(a<b));
		//logical
		boolean condition1 = true,condition2 = false;
		System.out.println("Logical AND:" +(condition1 && condition2));
		System.out.println("Logical OR:" +(condition1 || condition2));
		System.out.println("Logical NOT:" +(!condition1));
		//unary
		System.out.println("Post increment:" +(a++));
		System.out.println("Unary negation:" +(~a));
		System.out.println("Unary negation:" +(~b));                                                                                                                                                                                                                                                                 
		System.out.println("Pre decrement:" +(--b));
		//assignment
		a+=5;
		System.out.println("+=:" +a);
		//ternary
		String res = (a>b) ?"a is greater" : "b is greater";
			System.out.println("Result:" +res);
		//bitwise
			int x = 5, y = 3;
			System.out.println("Bitwise AND:" +(x & y));
			System.out.println("OR:" +(x | y));
			System.out.println("NOT:" +(~x));
			System.out.println("XOR:" +(x ^ y));
    }

}
