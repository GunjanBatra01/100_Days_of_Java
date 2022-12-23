public class FifthFunction{
    public static void main(String[] args) {
        String str = "This is my 38th Day";  
        System.out.println(str.endsWith("ay"));  
        if(str.endsWith(" ")) {  
            System.out.println("There's a white space at the end.");  
        }else System.out.println("There's no white space at the end.");
    }
}