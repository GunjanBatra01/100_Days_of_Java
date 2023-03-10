import java.io.*;
import java.util.*;
import java.lang.*;
 
class RemoveVowels
{
    static boolean is_vow(char c)
    {
        return (c == 'a') || (c == 'e') ||
               (c == 'i') || (c == 'o') ||
               (c == 'u');
    }
    static void removeVowels(String str)
    {
        System.out.print(str.charAt(0));
        for (int i = 1;
                 i < str.length(); i++)
     
            if ((!is_vow(str.charAt(i - 1))) ||
                (!is_vow(str.charAt(i))))
                System.out.print(str.charAt(i));
    }
     
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        removeVowels(str);
    }
}