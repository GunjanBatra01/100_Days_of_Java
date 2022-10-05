// Program to print table of a number entered by the user.

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Table of: ");
        int num = sc.nextInt();
        while(i <= 10){
            System.out.println(num + " * " + i + " = " + num*i);
            i += 1;
        }
    }
}