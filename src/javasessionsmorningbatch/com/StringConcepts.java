package javasessionsmorningbatch.com;

public class StringConcepts {

	public static void main(String[] args) {
		 //String---Anything which is enclosed with in double quotes is called String
        //group of characters enclosed within the double quotes is called a string
        //Example
        //char s='g';
        //String s="Welcome";
        
        String s="This is java code";
        String s1="s";//string
        System.out.println(s);
        System.out.println(s1);
        
        //to find the number of characters in the given string
        
        System.out.println(s.length());
        System.out.println(s1.length());
        
        //How to get the character in the given string
        System.out.println(s.charAt(5));
        //System.out.println(s.charAt(19));
        //System.out.println(s.charAt(-1));
        
        
        
        ////How to get the index of the character in the given string
        
        System.out.println(s.indexOf('i'));//first occurrence
        System.out.println(s.indexOf(' '));
        System.out.println(s.indexOf('a'));
        System.out.println(s.indexOf('i',s.indexOf('i')+1));//second of a character occurrence
        
        //to remove the space present the given string
        String ss="      nucot     company";
        System.out.println(ss);
        //trim is used to remove the space in the beginning of the string
        System.out.println(ss.trim());
        
        System.out.println(ss.replace(" ", ""));
        
    
        System.out.println(s.indexOf("java"));
        System.out.println(s.indexOf("code"));
        
        
        //contains
        String s2="Automation using selenium";
        
        
        System.out.println(s2.contains("selenium"));
        System.out.println(s2.contains("nucot"));
        
        
        //concat
        
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);//addition
        String s11="Hello";
        String s22="Welcome";
        String s33=s11+s22;//concate
        System.out.println(s33);//concate
        System.out.println(s33+a+b);
        System.out.println(s33+(a+b));//String plus integer
        System.out.println(a+b);
        
        
        
        
        
      //substring
        String s44="Welcome to java classess";
        System.out.println(s44.substring(11, 15));
        System.out.println(s44.substring(3));
        System.out.println(s44.substring(0, 7));
        
        String s45="hello world";
        System.out.println(s45.substring(0, 10));
        
        
    //Case conversion
        //1.touppercase
        String s46="hello world";
        System.out.println(s46.toUpperCase());
        
        //2.tolowercase
        String s47="HELLO WORLD";
        System.out.println(s47.toLowerCase());
        
        
        
        
        //split-->this to be explained in loops
        String s48="hello,world";
        String[] sp=s48.split(",");
        for(String ss1:sp)
        {
            System.out.println(ss1);
        }
        
        
        //important
        
        String str1="123";
        System.out.println(str1);
        int num    =Integer.parseInt(str1);
        
        System.out.println(num);
        
        
        
	}

}
