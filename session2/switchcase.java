package session2;

import java.util.Scanner;

public class switchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select any Operator");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter any choice (1/2/3/4): ");
		int option = sc.nextInt();
		System.out.println("Enter no 1");
		double no1 = sc.nextDouble();
		System.out.println("Enter no 2");
		double no2 = sc.nextDouble();
		System.out.println("Enter no 3");
		
		double no4 = sc.nextDouble();
		 
		double result;
		switch(option) {
		case 1:
			result = no1 + no2;
			System.out.println("Result is:" +result);
			break;
		case 2:
			result = no2 - no4;
			System.out.println("Result is:" +result);
			break;
		case 3:
			result = no2 * no4;
			System.out.println("Result is:" +result);
			break;
		case 4:
			if(no2 !=0) {
			result = no2 / no4;
			
			System.out.println("Result is:" +result);
			}
			else{
				System.out.println("Error");
			}
			break;
		
			default:
				System.out.println("Invaild option");
	
			
		}
		
		
	}

}
