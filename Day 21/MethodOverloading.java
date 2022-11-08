class Demo{
    void area(double a){
        System.out.println("\nArea of square with side " + a + " is: " + (a*a) + "\n");
    }
    void area(int r){
        int rsquare = r*r;
        System.out.println("Area of cicle with radius " + r + " is: " + (3.14*rsquare) + "\n");
    }
    void area(double length, double breadth){
        System.out.println("Area of rectangle with sides " + length + " and " + breadth + " is: " + (length*breadth) + "\n");
    }
    void area(int base, int height){
        System.out.println("Area of triangle with base " + base + " and height " + height + " is: " + (0.5*base*height) + "\n");
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.area(3.2);
        obj.area(5);
        obj.area(2.3, 1.2);
        obj.area(6, 3);
    }
}