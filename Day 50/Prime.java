import java.util.*;

class Prime
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j=3,m=1,s=1,c=0,d=0;
        while(j<=n)
        {
            for(i=(j+1);i<n;i++)
            {
                if((j+i)==n)
                {
                    for(m=1;m<=i;m++)
                    {
                        if(i%m==0)
                        {
                            c++;
                        }
                    }
                    for(s=1;s<=j;s++)
                    {
                        if(j%s==0)
                        {
                            d++;
                        }
                    }
                    if(c==2&&d==2)
                    {
                        System.out.println(j+" + "+i);
                    }
                }
            }
            c=0;
            d=0;
            j++;
        }
    }
}                   