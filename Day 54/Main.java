import java.util.*;

class Main{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(n==2)
        {
            System.out.println("The 2nd month is a February and have 28 days. ");
            System.out.println("In leap yaer The February month Have 29 days.");
        }
        else{
            System.out.println("Month have "+arr[(n-1)]+" days.");
        }
    }
}