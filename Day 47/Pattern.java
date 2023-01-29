import java.util.Scanner;

class Pattern{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for(int i=1;i<=rows;i++)
        {
            for(int j=rows-1;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=rows;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}