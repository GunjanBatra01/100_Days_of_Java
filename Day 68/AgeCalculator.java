import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

class AgeCalculator{
    public static void main(String argr[]) throws ParseException{
        Scanner in = new Scanner(System.in);
        String dat1 = in.next();
        String dat2 = in.next();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
        Date date1 = sdf.parse(dat1);
        Date date2 = sdf.parse(dat2);
        if(date1.compareTo(date2)>0){
            System.out.println(dat1+"is greater than "+dat2);
        }
        else if(date1.compareTo(date2)<0){
            System.out.println(dat1+"is less than "+dat2);
        }
    }
}