// Usage 6: Used to return current class instance

class Test{
    Test getTest(){
        return this;
    }
    void display(){
        System.out.println("This is sixth usage.");
    }
}

public class thisUsage6 {
    public static void main(String[] args) {
        new Test().getTest().display();
    }
}
