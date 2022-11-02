import java.util.Scanner;

class Area{
    void display(){
        System.out.print("Area is ");
    }
}

class Rectangle extends Area{
    void area(int length, int breadth){
        System.out.print(length*breadth);   
    }
}

public class singleInheritance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        Rectangle obj = new Rectangle();
        obj.display();
        obj.area(length, breadth);
    }
}