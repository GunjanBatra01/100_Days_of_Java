import java.util.*;

class Main{
 
    static int[] factorial = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };
 
    public static boolean isStrong(int N)
    {
 
        String num = Integer.toString(N);
 
        int sum = 0;
 
        for (int i = 0;
            i < num.length(); i++) {
            sum += factorial[Integer.parseInt(num.charAt(i) + "")];
        }
 
        return sum == N;
    }
 
    public static void printStrongNumbers(int L, int R)
    {
        for (int i = L; i <= R; i++) {
            if (isStrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int R=sc.nextInt();
        printStrongNumbers(L, R);
    }
}