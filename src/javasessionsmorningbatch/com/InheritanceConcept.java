package javasessionsmorningbatch.com;

class A
{
    void display()
    {
        System.out.println("this is parent class display method");
    }
    
    void add()
    {
        System.out.println("this is parent class add method");
    }
    
}
//syntax for creating the child class from parent
/*
class child_class_name extends parent_classname
{
  
  
}
*/
class B extends  A
{
  
  
  void add()
  {
      System.out.println("this is child class add method");
  }
  
  void sub()
  {
      System.out.println("this is child class sub method");
  }
    
}


public class InheritanceConcept {

	public static void main(String[] args) {
		
		  //creating obj for parent class
        System.out.println("Execution from creating Parent class object");
        A obj=new A();
        obj.display();
        obj.add();
        //below method is present in the child class
        //obj.sub();
        System.out.println("Execution from creating child class object");
        B obj1=new B();
        obj1.add();
        obj1.sub();
        obj1.display();
        

	}

}
