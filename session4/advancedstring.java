package session4;

public class advancedstring { 
	
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder ("good");
		
		//append
		sb.append("morning");
		System.out.println("After append:" +sb);
		
		//insert
		sb.insert(4, " ");
		System.out.println("After insert:" +sb);
		
		//replace
		sb.replace(5, 12, "afternoon");
		System.out.println("After replace:" +sb);
	
		//reverse
		sb.reverse();
		System.out.println("After reverse:" +sb);
}

}
