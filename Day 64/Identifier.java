// You are using Java
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Identifier{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();
        String pattern = "^[a-zA-Z][a-zA-Z0-9#-]{1,}$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        if(m.find())
        {
            System.out.println(input+" : Valid Identifier");
        }
        else 
        {
            System.out.println(input+ ":Invalid Identifier");
        }
    }
}