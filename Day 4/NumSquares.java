// Program to print number and it's square till 10.

public class NumSquares{
    public static void main(String[] args) {
        int num = 1;
        System.out.println("Number \t\t Square of Number");
        while(num<=10){
            System.out.println(num + "\t\t\t" + num*num);
            num += 1;
        }
    }
}