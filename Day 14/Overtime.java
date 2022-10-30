import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {
        int count = 1, working_hours, over_time;
        float over_time_pay;

        while(count<=10)
        {
            System.out.println("Enter the working hours of employee no. " + count);
            Scanner sc = new Scanner(System.in);
            working_hours = sc.nextInt();
            
            if(working_hours > 40)
            {
                over_time = working_hours - 40;
                over_time_pay = (float) (over_time * 12.00);
                System.out.println("Employee No." + count + " with overtime pay of " + over_time_pay);
            }
            else
                System.out.println("You have to work for more than 40 hours to get over time pay");

            count++;
        }
    }
}