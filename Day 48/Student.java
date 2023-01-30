import java.util.*;

class Student{
    public static void main(String arg[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        int d[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            b[i]=in.nextInt();
            c[i]=in.nextInt();
            d[i]=in.nextInt();
        }
        int sum[]=new int[n];
        for(int i=0;i<n;i++)
        {
            sum[i]=b[i]+c[i]+d[i];
            System.out.println(b[i]+c[i]+d[i]);
        }
        int m=0,a1=0;
        for(int i=0;i<sum.length;i++)
        {
            if(m<sum[i])
            {
                m=sum[i];
                a1=i+1;
            }
        }
    
        max1(b);
        max1(c);
        max1(d);
        System.out.println(a1+" "+m);
    }
    static void max1(int a[])
    {
        int max=0;
        int a1=0;
        for(int i=0;i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
                a1=i+1;
            }
        }
        System.out.println(a1+" "+max);
    }
}