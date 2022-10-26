import java.util.Scanner;

class Bikes{
    
    //Default Constructor
    Bikes(){
        System.out.println("\nThis is default constructor");
    }
    
    //Parameterized Constructor
    Bikes(String type){
        if(type == "Chopper" || type == "Cruiser" || type == "Touring" || type == "Street" || type == "Enduro" || type == "ATV" || type == "Sport" || type == "Cross"){
            System.out.println("This is " + type);
        }
        else{
            System.out.println("Please enter a valid choice");
        }
    }
}

public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any one bike type from:\n 1. Chopper\n 2. Cruiser\n 3. Touring\n 4. Street\n 5. Enduro\n 6. ATV\n 7. Sport\n 8. Cross\n");
        String bike_type = sc.next();
        
        Bikes b1 = new Bikes(); //It will call default constructor
        Bikes b2 = new Bikes(bike_type); //It will call parameterized constructor
    }
}