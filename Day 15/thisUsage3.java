class useThree{
    useThree(){
        System.out.println("This is third usage");
    }
    useThree(int x){
        this();
        System.out.println("This is " + x);
    }
}

public class thisUsage3 {
    public static void main(String[] args) {
        useThree obj = new useThree(3);
    }
}
