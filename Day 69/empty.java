import java.util.*;

class empty

{
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
        String s;
        s=sc.nextLine();
        if(s.isEmpty())
        {
            System.out.println("The string is empty");
        }
        else
        {
            System.out.println("The string is "+s);
        }
    }
}
