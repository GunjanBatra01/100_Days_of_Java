import java.util.*;

class main{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        System.out.println("1. If the radius is known");
        System.out.println("2. If the diameter is known");
        System.out.println("3. If the circumference is known");
        if(a==1){
            Double r=sc.nextDouble();
            Double area=Math.PI*r*r;
            System.out.printf("The area of the circle is: %.2f",area);
        }
        else if(a==2){
            Double d=sc.nextDouble();
            Double r=d/2;
            Double area=Math.PI*r*r;
            System.out.printf("The area of the circle is: %.2f",area);
        }
        else{
            Double c=sc.nextDouble();
            Double r=c/(2*Math.PI);
            Double area = Math.PI*r*r;
            System.out.printf("The area of the circle is: %.2f",area);
        }
    }
}