import java.util.Scanner;

public class PracticeProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = 1;
        while (true)
        {
            String line = sc.nextLine();
            System.out.println(lines + " " + line);
            lines++;
            if(!sc.hasNext())
            {
                break;
            }
        }
        sc.close();
    }
}