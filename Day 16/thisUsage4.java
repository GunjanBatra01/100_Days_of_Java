// Argument in the method

public class thisUsage4 {
    void display(thisUsage4 obj){
        System.out.println("This is fourth usage.");
    }
    void display2(){
        display(this);
    }
    public static void main(String[] args) {
        thisUsage4 obj = new thisUsage4();
        obj.display2();
    }
}