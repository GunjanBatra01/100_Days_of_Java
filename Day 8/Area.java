import java.util.Scanner;

class CalRectArea{
    double length, breadth, area;

    void setDim(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    void getArea(){
        area = length * breadth;
        System.out.print("Area of rectangle with sides " + length + " and " + breadth + " is: " + area + " sq. units");
    }
}

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();
        CalRectArea r1 = new CalRectArea(); //Creating object named r1
        r1.setDim(l, b);
        r1.getArea();
    }
}
