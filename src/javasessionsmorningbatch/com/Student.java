package javasessionsmorningbatch.com;

public class Student {
	  //class variables
    String name;
    int usn;
    int age;
    String address;
    String city;
    float salary;
    int mobileno;
	
	
	public static void main(String[] args) {
		 Student stuObj=new Student();
	        
	        stuObj.name="abc";
	        stuObj.usn=123;
	        stuObj.age=20;
	        stuObj.address="Bangalore,India";
	        stuObj.city="bangalore";
	        stuObj.salary=20000.02f;
	        stuObj.mobileno=123456;
	        
	        System.out.println(stuObj.name+" "+stuObj.usn+" "+stuObj.age+" "+stuObj.address+" "+stuObj.city+" "+stuObj.salary+" "+stuObj.mobileno);
	        
	        Student stuObj1=new Student();
	        
	        stuObj1.name="nucot";
	        stuObj1.usn=111;
	        stuObj1.age=15;
	        stuObj1.address="Bangalore,India";
	        stuObj1.city="bangalore";
	        stuObj1.salary=20000.02f;
	        stuObj1.mobileno=1234567;
	        System.out.println(stuObj1.name+" "+stuObj1.usn+" "+stuObj1.age+" "+stuObj1.address+" "+stuObj1.city+" "+stuObj1.salary+" "+stuObj1.mobileno);
	}

}
