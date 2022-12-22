interface A{
    String name = "Gunjan";
    String methodA();
}

interface B{
    String language = "Java";
    String methodB();
}

class Join implements A, B{
    public String methodA(){
        return name + " " + language;
    }
    public String methodB(){
        return language + " " + name;
    }
}

public class Question{
    public static void main(String[] args) {
        Join obj = new Join();
        System.out.println(obj.methodA());
        System.out.println(obj.methodB());
    }
}