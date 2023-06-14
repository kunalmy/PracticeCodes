package javasessionsmorningbatch.com;

public class NestedElseIfConcept {

	public static void main(String[] args) {
         //syntax
        /*if(condition)
        {
            
        }esle if(condition)
        {
            
        }esle if(condition)
        {
            
        }
        else
        {
            
        }
        */
        
        //.if esle if
        
        String browser="firefox";
        
        if(browser.equals("chrome"))
        {
            
            System.out.println("launch chrome browser");
                
        }
        else if(browser.equals("ie"))
        {
            System.out.println("launch ie browser");
            
        }
        else if(browser.equals("safari"))
        {
            System.out.println("launch safari browser");
        }
        else if(browser.equals("firefox"))
        {
            System.out.println("launch firefox browser");
        }
        else
        {
            System.out.println("Pass vaild browser");
        }
        
        //a,e,i,o,u
        
        
        char c='k';
        if(c=='a')
        {
            System.out.println("this is vowel-->"+ c);
            
        }
        else if(c=='e')
        {
            System.out.println("this is vowel-->"+ c);
        }
        else if(c=='i')
        {
            System.out.println("this is vowel-->"+ c);
        }
        else if(c=='o')
        {
            System.out.println("this is vowel--> "+ c);
        }
        
        else if(c=='u')
        {
            System.out.println("this is vowel-->"+ c);
        }
        else
        {
            System.out.println("Pass valid character vowel");
        }
        
        
        
        
	}

}
