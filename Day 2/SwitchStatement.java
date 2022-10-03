import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number from 1 to 3: ");
        int a = sc.nextInt();    
         
        switch (a){ 
 
        // when a is 1
        case 1: 

            System.out.println("Select one from Mango, Apple, and Cherry");
            String fruit = sc.next();

            switch (fruit) { 
            
            // when fruit is Mango
            case "Mango": 
                System.out.println("It's Mango! King of Fruits"); 
                break;
 
            // when fruit is Apple
            case "Apple": 
                System.out.println("An Apple a day does not keeps the doctor away, happiness does."); 
                break; 
 
            // when fruit is Cherry
            case "Cherry": 
                System.out.println("It's Cherry! Cutie Patootie"); 
                break; 
            } 
            break; 
 
        // when a is 2
        case 2: 
            System.out.println("a is 2");
            break; 
 
        // when a is 3 
        case 3: 
            System.out.println("a is 3"); 
            break; 
 
        default: 
            System.out.println("Invalid Input"); 
            break; 
        } 
    }
}