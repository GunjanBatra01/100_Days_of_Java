import java.util.*;
import java.util.regex.Pattern;

class RegularExpression{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        
        if(Pattern.matches("^-?[0-9]+$", input)){
            System.out.println("The datatype of "+input+" is: java.lang.Integer");
        }
        else if(Pattern.matches("^-?[0-9]+\\.[0-9]+$", input)){
            System.out.println("The datatype of "+input+" is: java.lang.Double");
        }
        else if(Pattern.matches("^[a-zA-Z]+$",input)){
            System.out.println("The datatype of "+input+" is: java.lang.String");
        }
        else if(Pattern.matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$",input)){
            System.out.println("The datatype of "+input+" is: java.lang.Date");
        }
        else{
            System.out.println("Invalid");
        }
    }
    
}