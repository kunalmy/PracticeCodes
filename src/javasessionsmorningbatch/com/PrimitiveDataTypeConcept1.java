package javasessionsmorningbatch.com;

public class PrimitiveDataTypeConcept1 {

	public static void main(String[] args) {
		  //1.byte: 
        //size:1 byte-->8 bits
        //range:-0 to -128 upto 0-127
        
        //Variable its name given to memory location when we can store the values and manipulate
        
        //syntax to variable init
        //data_type variable_name = value;
        //== ------>assignment operator
        System.out.println("byte data type concept");    
        byte b=10;    
             b=5;
             b=1;
             System.out.println(b);
             
        byte a=20;
             a=18;
        System.out.println(a);
        
        //2.short: 
                //size:2 byte-->2*8=16 bits
                //range:-32768  to 32767
                
                System.out.println("Short data types");
                
                short s=10;    
                      s=5;
                      s=1;
                      System.out.println("The value of ss is "+ s);
                  short ss=20;
                          ss=3;
                          System.out.println("The value of ss is "+ ss);
                          System.out.println("Sum of s and ss is"+ (ss+s));
                          
                          //We cannot add large data type to small data type
                      // byte result=s+a;
                          
                     byte aa=10;
                     short bb=11;
                
                          short result1=(short)(aa+bb);
                          System.out.println(result1);
                      
                 
                          System.out.println("int data type concept");                      
                      //3.int: 
                        //size:4 byte-->4*8=32 bits
                        //range: -2,147,483,648 to 2,147,483,647
                        
                        System.out.println("int data types");
                        
                                int i=10;    
                                    i=5;
                                    System.out.println("The value of i is "+ i);
                                int ii=20;
                                      ii=3;
                                  System.out.println("The value of ii is--> "+ ii);
                                  System.out.println("Sum of i and  ii -->"+ (i+ii));
                                  
                                  byte bbb=1;
                                  short sb=3;
                                  int c=bbb+sb;
                                  System.out.println(c);
                                  
                              
                          
        //*******************************************************************************
        
        //Examples of int datatypes
                System.out.println("*********");                  
            int aaa=10;
             aaa=20;
             aaa=30;
            int bbbb=20;
            int ccc=30;
            int dddd=-2147483648;//min
            int ddddd=2147483647;//max
            System.out.println(aaa);
            System.out.println(bbbb);              
            System.out.println(ccc);                        
            System.out.println(dddd);                    
            System.out.println(ddddd);                    
                                
            System.out.println("long data type concept");    
            //4.long
            //size:8 bytes-->8*8-->64bits
            //range-> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long ll=37676766676767L;
        long lll=23;
        
        long llll=-9223372036854775808L;//min
        
        long lllll=9223372036854775807L;//max
        
        System.out.println(ll);
        System.out.println(lll);
        System.out.println(llll);
        System.out.println(lllll);
	}

}
