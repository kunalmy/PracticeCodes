package javasessionsmorningbatch.com;

public class EmployeeDetails {

	String name;
    double salary;
    String address;
    int usn;
    int age;
    
    //default -->hidden constructor 
    
    EmployeeDetails()
    {
        
    }
    
    
    EmployeeDetails(String name2)
    {
        this.name=name2;
    }
    
    
    EmployeeDetails(String name2,float salary,String address,int usn,int age)
    {
        this.name=name2;
        this.salary=salary;
        this.address=address;
        this.age=age;
        this.usn=usn;
    }
   
	
	public static void main(String[] args) {
		
		 EmployeeDetails obj=new EmployeeDetails("Modi");
	     System.out.println(obj.name);
	        
	        EmployeeDetails obj1=new EmployeeDetails("Modi",20000.0f,"bangalore",123,20);
	        System.out.println(obj1.name+" "+obj1.salary +" "+obj1.address);
	        
	        
	} 

}
