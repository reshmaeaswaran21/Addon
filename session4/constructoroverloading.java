 package session4;

public class constructoroverloading {
 


   private String empname;
   private int empid;
   private String location;

    
   public constructoroverloading(String empname, int empid,String location) {
       this.empname =empname;
       this.empid = empid;
       this.location = location;
	}
   public constructoroverloading (String empname,String location) {
	   this(empname,0,location);
	   
   }
   public constructoroverloading (String empname,int empid) {
	   this(empname,empid,null);
   }
	
	public void displayInfo() {
		
		System.out.println("EmpName:" +this.empname);
		System.out.println("EmpId:"+this.empid);
		System.out.println("location:" +this.location);
		}
	
       public static void main(String[] args) {
	   constructoroverloading cox = new constructoroverloading("Reshma",9877,"Ooty");
	   constructoroverloading cox1= new constructoroverloading("Priya",99777);
	   constructoroverloading cox2 = new constructoroverloading("Kavya",7677,"Coonoor");
	   cox.displayInfo();
	   cox1.displayInfo();
       cox2.displayInfo();
    
   }
   }

   