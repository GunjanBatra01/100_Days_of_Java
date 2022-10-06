import java.util.Scanner;

public class BasicCalculator{
    public static void main(String[] args) {
        char c;
        int a, b, choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter two numbers: ");
        a = sc.nextInt();  // First operand
        b = sc.nextInt();  // Second operand
        do{
            System.out.println("\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
            System.out.print("\nPlease enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1: 
                    System.out.println("Addition of " + a + " and " + b + " is: " + (a+b));
                    break;
                case 2:
                    System.out.println("Subtraction of " + a + " and " + b + " is: " + (a-b));
                    break;
                case 3:
                    System.out.println("Multiplication of " + a + " and " + b + " is: " + (a*b));
                    break;
                case 4:
                    System.out.println("Division of " + a + " and " + b + " is: " + (a/b));
                    break;
                default:
                    System.out.println("Please enter valid operation number!");
            }
            System.out.println("Do you want to run more operations? y or n");
            c = sc.next().charAt(0);
        } while(c=='y');
    }
}