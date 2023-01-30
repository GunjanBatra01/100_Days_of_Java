import java.util.*;

class fibAndPow {
    static boolean pow2(int n){
        if(n==0 || n==Integer.MIN_VALUE)
            return false;
        return ((n & (n-1))==0);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n=sc.nextInt();
        int a=1, b=1;
        int sum=0;
        
        while(sum<=n){
            sum=a+b;
            if(sum>n)
                break;
            System.out.println(sum+" is a fibonacci number");
            if(pow2(sum))
                System.out.println(sum+" is a power of two");
            a=b;
            b=sum;
        }
    }
}