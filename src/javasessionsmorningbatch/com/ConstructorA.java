package javasessionsmorningbatch.com;

public class ConstructorA {

	String name;
    //Constructors are used to initialize the objects
    //1.Always Constructor name should be same as class name
    //2.Constructor does not have any return type including void
    //3.Constructors are executed(called) when you create object
    //4.Constructors will be overloaded
    
    //default
	ConstructorA()
    {
        System.out.println("this is default");
        
    }
    
    //single param constructor
	ConstructorA(int a)
    {
        System.out.println("This is single int param constructor");
    }
    
    
	ConstructorA(char a)
    {
        System.out.println("This is single char param constructor");
    }
    
	ConstructorA(char a,int b)
    {
        System.out.println("This is 2 param constructor with differenet order");
    }
    
	ConstructorA(int a,int b)
    {
        System.out.println("This is 2 param constructor");
    }
    
	ConstructorA(int a,int b,int c)
    {
        System.out.println("This is 3 param constructor");
    }
    
    void show()
    {
        System.out.println("This is Method");
    }
    
    
	
	public static void main(String[] args) {
	     //creation of object for class
		ConstructorA obj=new ConstructorA();
	
        obj.show();
        
        
        
        /*
        
        obj.name="nucot";
        System.out.println(obj.name);
        ConstructorA obj1 = new ConstructorA();
        obj1.name="abc";
        System.out.println(obj1.name);
        ConstructorA obj2=new ConstructorA();
        ConstructorA obj3=new ConstructorA();
        ConstructorA obj4=new ConstructorA();
        ConstructorA obj5=new ConstructorA();
        ConstructorA obj6=new ConstructorA();
        
        ConstructorA obj=new ConstructorA('s');
        */
        
	}

}
