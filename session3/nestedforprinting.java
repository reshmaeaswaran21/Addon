package session3;

import java.util.Scanner;


public class nestedforprinting {
	public static void main(String[] args) {
		
	//diamond pattern

		Scanner sc = new Scanner(System.in);
	      System.out.println("Enet the row");
		int rows = sc.nextInt();
		for(int i=1;i<=rows;i++) {
			for(int j=i;j<rows;j++) {
				System.out.print(" ");
				
				
				
			}
			for(int k=1;k<=(2*i+1);k++) {
				System.out.println();
			}
			// bottom half
			
			for(int i=rows-1;i>=1;i--) {
				for(int j=rows;j>i;j--) {
					System.out.print(" ");
					
					
					
				}
				for(int k=1;k<=(2*i+1);k++) {
					System.out.println();
				}
			
			
		}
		
	}
}

}
