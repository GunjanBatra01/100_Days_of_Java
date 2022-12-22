abstract class Shape{
    abstract void RectangleArea(double l, double b);
    abstract void SquareArea(double a);
    abstract void CircleArea(double r);
}

class Area extends Shape{
    double pi = 3.14;

    void RectangleArea(double l, double b){
        System.out.println("\nArea of Rectangle with l = " + l + " and b = " + b + " is: " + (l*b) + "\n");
    }

    void SquareArea(double a){
        System.out.println("Area of Square with side = " + a + " is: " + (a*a) + "\n");
    }

    void CircleArea(double r){
        System.out.println("Area of Circle with radius = " + r + " is: " + (pi*r*r) + "\n");
    }
}

public class Question{
    public static void main(String[] args) {
        Shape s1, s2, s3;
        s1 = new Area();
        s2 = new Area();
        s3 = new Area();
        s1.RectangleArea(3.4, 2);
        s2.SquareArea(2.6);
        s3.CircleArea(3);
    }
}