package javasessionsmorningbatch.com;

class Iphone5
{
    void makeCalls()
    {
        System.out.println("This is the makeCalls in Iphone 5");
    }
    
    void supportint2G()
    {
        System.out.println("This is supporting 2G");
    }
        
    
}
class Iphone10 extends Iphone5
{
    @Override
    void makeCalls()
    {
        System.out.println("Speed dial option is there");
        System.out.println("This is makeCalls in Iphone 10");
        
    }
    
    void supportint4G()
    {
        System.out.println("This is supporting 4G");
    }
    
    
    
    
}
class Iphone14 extends Iphone10
{
    
    @Override
    void makeCalls()
    {
        System.out.println("Voice call is avilable");
        System.out.println("This is the methos in iphone14");
    }
    
    void supportint5G()
    {
        System.out.println("This is supporting 5G");
    }
    
    void muticolors()
    {
        System.out.println("this is iphone 14 colors");
    }
    
}



public class InheritenceConcept4 {

	public static void main(String[] args) {

		 Iphone14 obj = new Iphone14();
	        
	        System.out.println("Methods present in Iphone14");
	        obj.makeCalls();//inherited
	        obj.supportint5G();//indival
	        obj.muticolors();//indival  
	        obj.supportint4G();//inherited
	        obj.supportint2G();//inherited
	        
	        /*
	        System.out.println("Methods present in Iphone10");
	        
	        Iphone10 obj1 = new Iphone10();
	        obj1.makeCalls();
	        obj1.supportint2G();
	        obj1.supportint4G();
	        
	        
	        System.out.println("Methods present in Iphone5");
	        Iphone5 obj2 = new Iphone5();
	        obj2.makeCalls();
	        obj2.supportint2G();
	    
	        */
	}

}
