package javasessionsmorningbatch.com;

public class MethodOverloadingConcept2 {

	void area(int a)
    {
        System.out.println("area with single parameter");
    }
    
    void area(int a,int b)
    {
        System.out.println("area with 2 parameter");
    }
    
    void area(double a)
    {
        System.out.println("area with single double parameter");
    }
    
    void area(float a)
    {
        System.out.println("area with single float parameter");
    }
    
    
    //application
    
    void login()
    {
        System.out.println("Login method with no parameters");
    }
    
    void login(String userName,String password)
    {
        System.out.println("Login method with 2 parameters");
    }
    
    void login(String userName,String password,String designation)
    {
        System.out.println("Login method with 3 parameters");
    }
    
    void login(String userName,String password,String designation,int ssn)
    {
        System.out.println("Login method with 4 parameters");
    }
    //
    void search()
    {
        System.out.println("Search method with no parameters");
    }
    void search(String productName)
    {
        System.out.println("Search method with one parameters");
    }
    
    void search(String productName,String colour)
    {
        System.out.println("Search method with 2 parameters");
    }
    
    
    void search(String productName,String colour,int price)
    {
        System.out.println("Search method with 3 parameters");
    }
    
    
    
    //online payment
    void payment()
    {
        System.out.println("payment method with no parameters");
    }
    
    void payment(String upi)
    {
        System.out.println("payment method with one parameters");
    }
    
    void payment(String credit,String holdername,int ccv,int expDate)
    {
        System.out.println("payment method with 4parameters");
        
    }
    void payment(String debit,int ccv,int atmpin)
    {
        System.out.println("payment method with 3 parameters");
    }
    
    
    //Swiggy
    
    void order()
    {
        System.out.println("Order method with no parameters");
    }
    void order(String restName,int price,float discount)
    {
        System.out.println("Order method with 3 parameters");
    }
    
    void order(String restName,int price,float discount,float rating)
    {
        System.out.println("Order method with 4 parameters");
    }
	
	
    
	public static void main(String[] args) {
		
		MethodOverloadingConcept2  obj=new MethodOverloadingConcept2();
		obj.order("kfc",500,10.5f,5.0f);
		
	}

}
