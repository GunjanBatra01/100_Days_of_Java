class Test{
    static int min = 10;
    int max = 50;
}

public class VariableWithStatic{
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println("Maximum value is: " + (obj.max)); //Access non-static variable
        System.out.println("Minimum value is: " + (Test.min)); //Access static variable through (classname.varname)
    }
}