package session2;

import java.util.Scanner;

public class elseifladder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the seating");
		int price = sc.nextInt();
    if (price>=60 && price <=100){
    	System.out.println("Seat 1 to 30");
    }
    else if(price>50 && price <150) {
    	System.out.println("Seat 30 to 60");
    }
    else if (price>90 && price <=300) {
    	System.out.println("Seat 60 to 90");
    }
    else if (price>90 && price <=300) {
    	System.out.println("Seat 60 to 90");
    }
    else if (price>=500 && price >1000) {
    	System.out.println("Special cabin");
    }


	}
}