package javasessionsmorningbatch.com;

public class MethodOverloadingConcept {

	  //Method overloading--->Single class
    //1.if class contains multiple methods-->All the methods should have same name
    //2.with Different parameters
    //3.With different number of parameters
    //4.With different order of the parameters
	//note: can we overload main method? answer=yes
    
    public void add()
    {
        System.out.println("this is addition method as no parameters");
        //local variables
        int a=10;
        int b=30;
        int c=a+b;
        System.out.println(c);
    }
    
    public void add(int a,int b)
    {
        System.out.println("this is addition method having 2 integer parameters");
        int c=a+b;
        System.out.println(c);
    }
    
    public void add(int a,int b,int c)
    {
        System.out.println("this is addition method having 3 intege parameters");
        int d=a+b+c;
        System.out.println(d);
    }
    
    public void add(int a,int b,int c,int d)
    {
        System.out.println("this is addition method having 4 intege parameters");
        int e=a+b+c+d;
        System.out.println(e);
    }
    public void add(double d,double e) 
    {
        System.out.println("this is addition method having 2 double parameters");
        double c=d+e;
        System.out.println(c);
        
    }
    
    public void add(int d,double e) 
    {
        System.out.println("this is addition method having 2 parameters with one is integer and other is double");
        double c=d+e;
        System.out.println(c);
    }
    public void add(double d,int e) 
    {
        System.out.println("this is addition method having 2 parameters with one is double and other is integer");
        double c=d+e;
        System.out.println(c);
    }
    public void add(float e,int d) 
    {
        System.out.println("this is addition method having 2 parameters with one is float and other is integer");
        float c=e+d;
        System.out.println(c);
    }
    
    
    
	public static void main(String[] args) {
		
		MethodOverloadingConcept obj=new MethodOverloadingConcept();
        obj.add();
        obj.add(2,3);
        obj.add(1,2,3);
        obj.add(1,2,3,4);
        obj.add(1.0,2.0);
        obj.add(1,5.0);
        obj.add(1.0,10);
        obj.add(2.0f,6);

	}

}
