import java.util.*;

public class TicketType{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>0){
            if(age >= 15){
                System.out.println("Adult ticket");
            }
            else{
                System.out.println("Child ticket");
            }
        }
        else
            System.out.println("Age must be greater than 0.");
    }
}