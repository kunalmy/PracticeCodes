package javasessionsmorningbatch.com;

class CC
{
    public void read() 
    {
        System.out.println("Method in parent");
        
    }
    
    public void hello()
    {
        System.out.println("this is hello in parent");
    }
}

class DD extends CC
{
    @Override 
    public void read() 
    {
        System.out.println("Method in child");
    }
    
    public void hi()
    {
        System.out.println("thisn is child class hi");
    }
}

public class InheritanceConcept3 {

	public static void main(String[] args) {

		//top casting          //Child class object can be referred by parent class ref variable
        CC obj=new DD();
        obj.read();
        obj.hello();
        
        
        
        //down casting
        CC obj1=(CC)new DD();
        obj1.read();
        obj.hello();
        
	}

}
