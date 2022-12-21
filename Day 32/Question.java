import java.util.Scanner;

class Reverseeach{
    public void reverseEachWordInString(String str1) {
        String[] each_words = str1.split(" ");
        String revString = "";
  
        for (int i=0; i<each_words.length; i++) {
            String word = each_words[i];
            String reverseWord = "";
            for (int j=word.length()-1; j>=0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            revString = revString + reverseWord + " ";
        }
        System.out.println(revString);
    }
}

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reverseeach obj = new Reverseeach();
        System.out.print("Enter a string: ");
        String StrGiven = sc.nextLine();
        System.out.print("String after reversing word by word: ");
        obj.reverseEachWordInString(StrGiven);
    }
} 
