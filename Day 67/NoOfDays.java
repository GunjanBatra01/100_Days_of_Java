import java.util.*;

class NoOfDays{
    public static boolean year(int year)
    {
        if(year%400==0){
            return true;

        }
        else if(year%4==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        if(start<end){
            for(int i= start;i<=end;i++){
                boolean check  = year(i);
                if(check){
                    System.out.println("Year: "+i+"="+"366");
                }
                else{
                    System.out.println("Year: "+i+"="+"365");
                }
            }
            return;
        }
        System.out.println("End year must be greater than first year!");
    }
}