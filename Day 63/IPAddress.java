import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.*;

class IPAddress{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();
        String pattern = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern r =  Pattern.compile(pattern);
        Matcher m = r.matcher(input);
        if(m.find()){
            System.out.println("IP address "+input+" is Valid");
        }
        else 
        {
            System.out.println("IP address "+input+" is Invalid");
        }
    }
}