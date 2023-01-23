import java.util.Scanner;

class ThrillRide{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age>0){
            if(age<15 || age>60){
                System.out.println("Not Allowed");
            }
            else{
                System.out.println("Allowed");
            }
        }
        else
            System.out.println("Age must be greater than 0.");
    }
}