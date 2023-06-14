package javasessionsmorningbatch.com;

public class SwitchConcepts2 {

	public static void main(String[] args) {
		String browser="o";
        switch(browser)
        {
        
        case "chrome":
            System.out.println("launch chrome browser");
            break;
        case "ie":
            System.out.println("launch ie browser");
            break;
        
        case "safari":
            System.out.println("launch safari browser");
            break;
        case "firefox":
            System.out.println("launch firefox browser");
            break;
        
        case "opera":
            System.out.println("launch opera browser");
            break;
        
        default:
            System.out.println("Pass vaild browser name");
            break;
        
        }
        
        
        System.out.println("Thanks");
        
  
        

	}

}
