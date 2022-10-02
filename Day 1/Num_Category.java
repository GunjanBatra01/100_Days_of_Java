import java.util.*;

public class Num_Category {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        if(n>0 && n%2==0){ // accepts positive even number
            System.out.println("Even Number: " + n);
            if(n>=2 && n<5){
                System.out.println("Number lies between 1 to 5");
            }
            else if(n>=6 && n<=20){
                System.out.println("Number lies between 6 to 20");
            }
            else{
                System.out.println("Number is greater than 20");
            }
        }
        else if(n>0 && n%2!=0){ // accepts positive odd number
            System.out.println("Odd Number: " + n);
        }
        else
            System.out.println("Invalid Input");
    }
}
