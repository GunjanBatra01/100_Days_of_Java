import java.util.Scanner;

public class PrimeNumbers{
    public static void main(String[] args){		
        int i=0;
        int num=0;
        String primeNumbers = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to know prime numbers: ");
        int upperlimit = sc.nextInt();

        if(upperlimit>1){
            for (i=1; i<=upperlimit; i++){ 		  	  
                int counter=0; 	  
                for(num=i; num>=1; num--){
                    if(i%num==0){
                        counter = counter + 1;
                    }
                }
                if(counter==2)
                {
                    primeNumbers = primeNumbers + i + " ";
                }
            }
            System.out.println("Prime numbers from 1 to " + upperlimit + " are: ");
            System.out.println(primeNumbers);
        }
        else if(upperlimit == 1)
            System.out.println("1 is neither prime nor composite.");
        else
            System.out.println("Invalid Input");
   }
}