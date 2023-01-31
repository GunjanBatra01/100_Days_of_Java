import java.util.*;

class triangle{
    public static void main(String []args)
    {
        Scanner sc = new Scanner( System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a==b&&b==c)
        {
            System.out.println("This is an equilateral triangle.");
        }
        else if(a!=b&&b!=c&&a!=c)
        {
            System.out.println("This is a scalene triangle.");
        }
        else{
            System.out.println("This is an isosceles triamgle.");
        }
    }
}