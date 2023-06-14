package javasessionsmorningbatch.com;

public class NestedIf2 {

	public static void main(String[] args) {
		//nested if and esle
        //if if......else
        
        
        String browser="fir";
        if(browser.equalsIgnoreCase("firefox"))
        {
            if(browser.equals("chrome"))
            {
                System.out.println("launch chrome");
                
            }
            if(browser.equals("ie"))
            {
                    System.out.println("launch ie");
            }
            if(browser.equals("firefox"))
            {
                System.out.println("launch firefox");
            }
            if(browser.equals("safari"))
            {
                System.out.println("launch safari");
            }
        }
        else
        {
            System.out.println("Please pass the vaild browser name");
        }
        
        

	}

}
