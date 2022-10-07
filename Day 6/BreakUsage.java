public class BreakUsage{
    public static void main(String[] args) {

        // break usage in for loop.
        System.out.println("============== break in for loop ==============");
        for(int i=1; i<=10; i++){
            if(i==6){
                break;
            }
            System.out.println(i);
        }

        // break usage in while loop.
        int j=1;
        System.out.println("============== break in while loop ==============");
        while(j<=10){
            if(j==6){
                j++;
                break;
            }
            System.out.println(j);
            j++;
        }

        // break usage in do-while loop.
        int k=1;
        System.out.println("============== break in do-while loop ==============");
        do{
            if(k==6){
                k++;
                break;
            }
            System.out.println(k);
            k++;
        } while(k<=10);
    }
}