// Program to print sum of digits of the number entered by the user.

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        int rem = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num >= 0){
            while(num!=0){
                rem = num % 10;
                sum = sum + rem;
                num = num/10;
            }
            System.out.println("Sum of the digits is: " + sum);
        }
        else
            System.out.println("Invalid Input");
    }
}