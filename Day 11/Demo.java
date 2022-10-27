class Construct_Overload{
    int a, b;
    Construct_Overload(){
        a = 10;
        b = 20;
        System.out.println("Inside 1st Constructor");
    }
    Construct_Overload(int x){
        a = x;
        System.out.println("Inside 2nd Constructor");
    }
    Construct_Overload(int x, int y){
        a = x;
        b = y;
        System.out.println("Inside 3rd Constructor");
    }
    public void display(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}

public class Demo{
    public static void main(String[] args) {
        Construct_Overload obj = new Construct_Overload();
        Construct_Overload obj1 = new Construct_Overload(40);
        Construct_Overload obj2 = new Construct_Overload(30,60);
        obj.display();
        obj1.display();
        obj2.display();
    }
}