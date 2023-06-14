package javasessionsmorningbatch.com;

public class SwitchConcept4 {

	public static void main(String[] args) {
		 String envName="test";
	        
	        switch(envName.toLowerCase())
	        {
	        
	        
	        case "local":
	             System.out.println("Running the scripts in local env");    
	             break;
	        
	        case "test":
	             System.out.println("Running the scripts in Test env");    
	             break;
	        
	        case "stage":
	             System.out.println("Running the scripts in Stage env");    
	             break;
	        
	        case "prod":
	             System.out.println("Running the scripts in Prod env");    
	             break;
	             
	        default:
	            System.out.println("Pass vaild envname");
	        
	        
	        }
	        
	        
	        
	        //a e i o u
	        
	        
	        char vowel='o';
	        
	        switch(vowel)
	        {
	    
	        case 'a':
	             System.out.println("This is vowel");    
	             break;
	        
	        case 'e':
	            System.out.println("This is vowel");    
	             break;
	        
	        case 'i':
	            System.out.println("This is vowel");    
	                     break;
	        case 'o':
	            System.out.println("This is vowel");    
	             break;
	        case 'u':
	            System.out.println("This is vowel");    
	             break;
	        default:
	            System.out.println("Pass vaild value");
	        
	        
	        }
	            
	        

	}

}
