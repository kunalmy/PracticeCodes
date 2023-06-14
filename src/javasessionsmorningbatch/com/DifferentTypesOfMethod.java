package javasessionsmorningbatch.com;

public class DifferentTypesOfMethod {

	 //type-1
    //method does not have return type and no parameters or arguments
    void display()
    {
        System.out.println("Welcome to selenium course");
    }
    
    //method  have return type and no parameters or arguments
        int add()
        {
            System.out.println("Adding two  numbers");
            int i=1;
            int j=2;
            int z=i+j;
            return z;
        }
    
        double sub()
        {
            int i=5;
            int j=2;
            int z=i-j;
            return z; 
        }
    
    
        //method 3
        //method does'nt have return type and having parameters or arguments
        
        
        void mul(int a, int b)
        {
            int c=a*b;
            System.out.println(c);
        }
    
    
	public static void main(String[] args) {
		
		  DifferentTypesOfMethod  objName=new DifferentTypesOfMethod();
	        objName.display();
	        System.out.println(objName.add());
	        System.out.println(objName.sub());
	        objName.mul(2, 3);
	        

	}

}
