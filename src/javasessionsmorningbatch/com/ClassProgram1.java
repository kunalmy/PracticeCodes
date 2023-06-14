package javasessionsmorningbatch.com;

public class ClassProgram1 {
	
	//class is called User define
    //blue print or template-->properties(attributes)(Data members) and behaviors(Methods)
    
    //OOPS concept
    //1.Data members(normal data or static data)()
        //a.class variables b.local variables c.static variables
    //2.Methods(Normal methods or static methods)
    //3.static data
    //4.constructors
    
    //1.class variables or global variables
    
    //variable declaration
        int a;
    
    //variable init;(Data members)-->global variable or class variables
        int aa=20;
        String s="nucot";
        String ss="Hello";
        char c='a';
        byte b=20;
        float f=1.0f;
        double d=20.0;
    
    //Methods
        
        //syntax of method
        /*
        data_type method_name()
        {
            //body or statements
            
        }
        */
        
        //void, int,float,char,String,byte,Double...etc
        //Always method name should be wrritten in camel case
        public void addTwoNumbers()
        {
            int aaa=2;
            int bbb=30;
            int ccc=aaa+bbb;
            System.out.println(ccc);
            
        }
        
        public void subTwoNumbers()
        {
            int ss=20;
            int sss=3;
            int ssss=ss-sss;
            System.out.println(ssss);
            
        }
        
        public void mulTwoNumbers()
        {
            int e=20;
            int r=3;
            int y=e*r;
            System.out.println(y);
            
        }
        
	
	public static void main(String[] args) {
		  
        //syntax for creating object
        
    //    class_name object_name=new class_name();
        
        ClassProgram1 obj=new ClassProgram1();

        System.out.println(obj.aa);
        System.out.println(obj.s);
        System.out.println(obj.b);
        //to execute the method
        obj.addTwoNumbers();
        obj.subTwoNumbers();
        obj.mulTwoNumbers();
	}

}
