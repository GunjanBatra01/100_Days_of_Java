class useTwo{
    void displayA(){
        System.out.println("This is A");
    }
    void displayB(){
        System.out.println("This is B");
        this.displayA();
    }
}

public class thisUsage2 {
    public static void main(String[] args) {
        useTwo obj = new useTwo();
        obj.displayB();
    }
}
