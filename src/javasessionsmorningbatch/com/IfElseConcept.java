package javasessionsmorningbatch.com;

public class IfElseConcept {

	public static void main(String[] args) {
		 int n=1;
	        if(n>=0)
	        {
	            System.out.println("this is +ve number");
	        }
	        else
	        {
	            System.out.println("this is -ve number");
	        }
	        
	        
	        int en=0;
	        if(en%2==0)
	        {
	            System.out.println("this is even number");
	        }
	        else
	        {
	            System.out.println("this is odd number");
	        }
	        
	        
	        //== and .equal
	        
	        
	        String s="heLlo";
	        String s1="hello";
	        if(s.equals(s1))
	        {
	            System.out.println("both are equal");
	        }
	        else {
	            System.out.println("not equal");
	            
	        }
	            
	        String s11="nuCot";
	        String s12="NUCOT";
	        if(s11.equalsIgnoreCase(s12))
	        {
	            System.out.println("both are equal");
	        }
	        else {
	            System.out.println("not equal");
	            
	        }
	        
	        
	         
	}

}
