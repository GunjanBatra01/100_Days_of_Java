import java.util.*;

class Main 
{ 
    public static void main(String args[])
    {
        int y;
        Scanner s = new Scanner(System.in);
        y=s.nextInt();
        if((y%400)==0||(y%100)==0||(y%4)==0)
        {
            System.out.println(y +" is a leap year.");
        }
        else{
            System.out.println(y+" is not a leap year.");
        }
    }      
}