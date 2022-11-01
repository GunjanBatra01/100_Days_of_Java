// Usage 5: Argument in the constructor call

class useFive{
    thisUsage5 obj;
    useFive(thisUsage5 obj){
        this.obj = obj;
    }
    void display(){
        System.out.println(obj.data);
    }
}

public class thisUsage5 {
    int data = 10;
    thisUsage5(){ // default constructor
        useFive five = new useFive(this);
        five.display();
    }
    public static void main(String[] args) {
        thisUsage5 a = new thisUsage5();
    }
}
