import java.util.*;

class Solution{
    private String name,day;
    private int temp;
    
    Solution(){
        this.name = "Argentina";
        this.day= "Yesterday";
        this.temp= 29;
    }
    
    Solution(String name,int temp){
        this.name = name;
        this.day = "Today";
        this.temp = temp;
    }
    Solution(String name,String day,int temp){
        this.name = name;
        this.day = day;
        this.temp = temp;
    }
    
    void display(){
        System.out.println(this.name+" "+this.day+" Temperature: "+this.temp+"°");
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int temp = sc.nextInt();

        Solution s1 = new Solution();
        Solution s2 = new Solution(name,temp);
        
        name = sc.next();
        String day = sc.next();
        temp = sc.nextInt();
        Solution s3 = new Solution(name,day,temp);
        s1.display();
        s2.display();
        s3.display();
    }
}