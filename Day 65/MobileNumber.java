import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MobileNumber{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String pattern = "^[7-9][0-9]{9}$";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);
        if(m.matches())
        {
            System.out.println(input+" : Valid Number");
        }
        else{
            System.out.println(input+ " : Invalid Number");
        }
    }
}