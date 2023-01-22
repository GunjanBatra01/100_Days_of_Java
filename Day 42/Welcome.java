import java.util.Scanner;

public class Welcome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>0){
            if(age >= 15){
                System.out.println("Welcome to the show");
            }
            else{
                System.out.println("\nWelcome to the show");
                System.out.println("Please note that you should be accompanied by an adult");
            }
        }
        else
            System.out.println("Age must be greater than 0.");
    }
}