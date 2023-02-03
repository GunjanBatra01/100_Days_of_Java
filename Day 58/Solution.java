import java.util.*;

class Solution{
    double l,h;
    Solution(double l,double h){
        this.l = l;
        this.h = h;
    }
    
    double calculateArea(){
        return l*h;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double l1 = sc.nextDouble();
        double h1 = sc.nextDouble();
        double l2 = sc.nextDouble();
        double h2 = sc.nextDouble();
        
        Solution s1 = new Solution(l1,h1);
        Solution s2 = new Solution(l2,h2);
        
        System.out.println("Area of Wall 1: "+s1.calculateArea());
        System.out.printf("Area of Wall 2: %.2f",s2.calculateArea());
    }
}