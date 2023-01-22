import java.util.Scanner;

public class Series{
    public static void main(String[] args){
        int j = 6;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms you want to display for the series: ");
        int n = sc.nextInt();
        if(n>0){
            System.out.println("Series: ");
            for(int i=1;i<=n;i++){
                System.out.print(j+" ");
                j=j+(5*i);
            }
        }
        else
            System.out.println("Number of terms must be greater than 0.");
    }
}