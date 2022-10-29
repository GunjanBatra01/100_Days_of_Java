class Test{
    static int min = 10;
    int max = 50;

    // Non-Static Method
    void display(){
        System.out.println(min); //Static instance variables are accessible inside non-static method.
        System.out.println(max);
    }

    // Static Method
    static void statDisplay(){
        System.out.println(min);
        // System.out.println(max); This will give error since non-static variables are not accessible via static methods.
    }
}

public class StaticMethod{
    public static void main(String[] args) {
        Test obj = new Test();
        obj.display();
        Test.statDisplay(); // Static methods are called using syntax <classname.methodname>
    }
}