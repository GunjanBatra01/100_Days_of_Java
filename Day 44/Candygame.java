import java.util.*;

class Candygame{
    public static void main(String[] args){
        int n, count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;n>0;i++){
            if(n%10 == 4){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}