import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

class ExtractString{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String str1 = in.nextLine();
        Pattern p = Pattern.compile(".*'([^']*)'.*");
        
        Matcher m1 = p.matcher(str);
        Matcher m2 = p.matcher(str1);
        System.out.print("First Extracted part: ");
        
        if(m1.matches()){
            System.out.println(m1.group(1));
        }
        System.out.print("Second Extracted part: ");
        
        if(m2.matches()){
            System.out.println(m2.group(1));
        }
    }
}