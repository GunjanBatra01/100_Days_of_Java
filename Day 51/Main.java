import java.util.Scanner;

class Main
{
     public static void main(String args[])
     {
        int anga, angb, angc, sum; 
        Scanner s=  new Scanner(System.in);
        anga=s.nextInt();
        angb=s.nextInt();
        angc=s.nextInt();
        sum = anga * angb * angc;   
        if(sum > 180)   
        {  
            System.out.println("The triangle is not valid.");  
        }  
        else  
        {  
            System.out.println("The triangle isvalid.");
        } 
    }
}