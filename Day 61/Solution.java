import java.util.*;

class Solution{
    String name,phnum;
    Solution(String name,String phnum){
        this.name = name;
        this.phnum = phnum;
    }
    
    void input(String name,String phnum){
        this.name = name;
        this.phnum = phnum;
    }
    
    void display(){
        System.out.println(this.name+" "+this.phnum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution S[] = new Solution[n];
        String name,phnum;
        
        for(int i=0;i<n;i++){
            name= sc.next();
            phnum = sc.next();
            S[i] = new Solution(name,phnum);
        }
        
        String str = sc.next();
        int size = str.length();
        
        for(int j=0;j<n;j++){
            if(S[j].name.contains(str)){
                S[j].display();
            }
        }
    }
}