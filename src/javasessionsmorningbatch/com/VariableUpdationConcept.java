package javasessionsmorningbatch.com;

public class VariableUpdationConcept {

	public static void main(String[] args) {
 //1.Post increment
        
        int i=1;
        int j=i++;//---i--->i+1
        System.out.println(i);
        System.out.println(j);
        
        
        int a=5;
        int b=a++;
        System.out.println(a);
        System.out.println(b);
        
        int q=-3;
        int w=q++;
        System.out.println(q);
        System.out.println(w);
        
        //2.pre increment
        
        int c=2;
        int d=++c;
        System.out.println(c);
        System.out.println(d);
        
        
        int x=5;
        int y=++x;
        System.out.println(x);
        System.out.println(y);
        
        int k=-4;
        int l=++k;
        System.out.println(k);
        System.out.println(l);
        
        
        //3.Post decrement
        int g=5;
        int h=g--;
        System.out.println(g);
        System.out.println(h);
        
        //4.Pre decrement
        
        int s=5;
        int z=--s;
        System.out.println(s);
        System.out.println(z);
        
        
        

	}

}
