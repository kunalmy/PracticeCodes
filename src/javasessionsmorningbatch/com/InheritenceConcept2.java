package javasessionsmorningbatch.com;

//Method Overriding
//1.Happens between two class-->parent and child relationship
//2.When you have a method in the parent class and same method you have in child class
//same name
//same number of parameters
class AAAA
{
  
  void show()
  {
      System.out.println("This is old show method");
  }
  
  void display()
  {
      System.out.println("This is parent display method");
  }
  
  void add()
  {
      System.out.println("This is parent add method");
  }
  
}
class BBBB extends  AAAA
{
  
  void show()
  {
      System.out.println("This is new show method");
  }
  
  void display()
  {
      System.out.println("This is child display method");
  }
  
  void mul()
  {
      System.out.println("This is child mul method");
      
  }
  
  

public class InheritenceConcept2 {
	
}
	public static void main(String[] arg) {
		
		  /*    AAAA obj =new AAAA();
        obj.show();
        obj.display();
    */  
        
        BBBB obj1=new BBBB();    //METHOD OVERRIDING
        obj1.display();      //inherited
        obj1.show();
        obj1.mul();          //individual
        obj1.add();
        

	}
}
