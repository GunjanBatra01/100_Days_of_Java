import java.util.*;

class Main
{
    public static void main(String args[])
    {
        int n,i,t=9;
	    int sum =t,f=9;
	    System.out.println(t);
	    Scanner s =  new Scanner(System.in);
	    n=s.nextInt();
	    for (i=2;i<=n;i++)
	    { 
	        f=(f*10)+t;
	        System.out.println(f);
	        sum+=f;
    	}
        System.out.println(sum);
    }
}