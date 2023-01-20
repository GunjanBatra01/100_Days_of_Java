import java.util.Scanner;

public class Series{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms you want to display for the series: ");
        int a = sc.nextInt();
        if(a>0){
            System.out.print("Series: ");
            for(int i=1;i<=a;i++){
                System.out.print((i*i) + " ");
            }
        }
        else
            System.out.println("Number of terms must be greater than 0");
    }
}