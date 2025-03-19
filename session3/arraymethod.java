package session3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraymethod {
public static void main(String[] args) {
	//length of the array
	int[] num = {10,20,30,40,50};
	System.out.println("Lenth of the num:" +num.length);
	
	
	//Copying an array
	int[] source = {1,2,3,4,5};
	int[] destination = new int[5];
	
	
	// copy array
	System.arraycopy(source, 0, destination, 0, source.length);
	for(int i : destination) {
		System.out.print(i+" ");
	}
	
	
	//sorting
	int[] b = {12,83,90,05,8,23};
	Arrays.sort(b);
	System.out.println(Arrays.toString(b));
	
	
	//Array fill
	int[] d = new int[5];
	Arrays.fill(d, 1);
	Arrays.fill(d, 1,4,3);
	System.out.println(Arrays.toString(d));
}
}
