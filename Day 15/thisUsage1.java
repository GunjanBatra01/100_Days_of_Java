class useOne{
    int x, y;
    useOne(int x, int y){ //Constructor
        this.x = x;
        this.y = y;
    }
    void sum(){ //Method
        System.out.println("Sum is: " + (x+y));
    }
}

public class thisUsage1{
    public static void main(String[] args) {
        useOne obj = new useOne(3, 4);
        obj.sum();
    }
}