package session2;

import java.util.Scanner;

public class nestedifelse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the age:");
	int age = sc.nextInt();
	 System.out.println("Enter the weight");
	 int weight = sc.nextInt();
	 if(age>20)
	  {
	  if(weight>50)
	  {
		  System.out.println("can donate blood");
	  }
	  else {
		  System.out.println("under weight cannot donate blood");
	  }
	  }
	  else
	  {
		System.out.println("Your age is not satisfied");  
	  }
	  
	  }  
}
