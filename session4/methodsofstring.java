package session4;

import java.util.Scanner;

public class methodsofstring {
	public static void main(String[] args) {
  		String s1 = "Java";
		String s2 ="Program";
		String s3="Program";
		s1 =s1+s2;
		System.out.println(s1);                   
  	 	 String ss1 = "Java Program";
		 // length
		 System.out.println(s1.length());
		 // equals
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter username");
		 String username = sc.nextLine();
		 
		 System.out.println("enter password");
		 String password = sc.next();
		  if(username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin@123")) {
			  System.out.println("Success");
		  }else {
			  System.out.println("Error 404 found");
			  
		  }
		  //equal to
		   String s5 = "Reshma";
		   String s6 ="reshma";
		   System.out.println(s5==s6);
		  
		  String name = new String ("Reshma");
		  String name2 = new String("Priya");
		  System.out.println(name==name2);
		   
		   
		   
		   
		   // compare to
		   String s7="morning";
		   String s8="Afternoon";
		   System.out.println(s7.compareTo(s8));
		   
		 // concat  
		String str1 = "Static";
		String str2 = "Program";
		System.out.println(str1.concat(str2));                        
		
		
		// tocharArray()

		String str3 = "Welcome to Java";
		System.out.println("Value of method");
		//char[] c = str3.toCharArray();
		System.out.println(str3.toCharArray());
		
		
		// substring
		
		System.out.println(str3.substring(6));
		System.out.println(str3.substring(3, 9));               
		
		
		
		// intern
		
		String  clg ="Kgcas";
		String clg1 = new String("Kgisl");
		String str4 = clg1.intern();
		
		System.out.println(clg==str4);
		
		
		
		
		
	}

}
