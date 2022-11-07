class Operation{
    int evaluate(int a, int b){
        return a*b;
    }
}

public class Aggregation{
    Operation op;
    double pi = 3.14;
    
    double curved_surface_area(int radius, int height){
        op = new Operation();
        int rh = op.evaluate(radius, height);
        return 2*pi*rh;
    }

    public static void main(String[] args) {
        Aggregation obj = new Aggregation();
        double result = obj.curved_surface_area(5, 12);
        System.out.println("Curved Surface Area of cylinder with radius 5 and height 12 is: " + result);
    }
}