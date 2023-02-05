import java.util.*;

class Solution{ 
    double w,h,d;
    
    Solution(){
        this.d = d;
        this.h = h;
        this.w = w;
    }
    
    Solution(double w,double h,double d){
        this.d = d;
        this.w = w;
        this.h = h;
    }
    
    Solution(double l){
        this.d = l;
        this.w = l;
        this.h = l;
    }
    
    double volume(){
        return d*w*h;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        double d = sc.nextDouble();
        double w = sc.nextDouble();
        double h = sc.nextDouble();
        double l = sc.nextDouble();
        
        Solution s1 =new Solution();
        Solution s2 = new Solution(w,h,d);
        Solution s3 = new Solution(l);
        
        System.out.println("Volume of mybox1 is "+(int)s1.volume());
        System.out.println("Volume of mybox2 is "+(int)s2.volume());
        System.out.println("Volume of mycube is "+(int)s3.volume());
    }
}