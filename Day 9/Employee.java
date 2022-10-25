import java.util.Scanner;

class GetInformation{
    int id, salary;
    String fname, lname;
    
    GetInformation(int id, String fname, String lname, int salary){ //Parameterized Constructor
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }
    int getID(){
        return id;
    }
    String getFirstName(){
        return fname;
    }
    String getLastName(){
        return lname;
    }
    String getName(){
        return (fname + " " + lname);
    }
    int getSalary(){
        return salary;
    }
    int getAnnualSalary(){
        return (salary*12);
    }
    int raiseSalary(int percent){
        if(percent != 0){
            return (salary*percent);
        }
        else{
            return salary;
        }
    }
}

public class Employee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        int identity = sc.nextInt();
        
        System.out.print("Enter Employee First Name: ");
        String first_name = sc.next();
        
        System.out.print("Enter Employee Last Name: ");
        String last_name = sc.next();
        
        System.out.print("Enter Employee Salary: ");
        int sal = sc.nextInt();
        
        System.out.print("Enter salary raise percentage: ");
        int percentage = sc.nextInt();
        
        GetInformation emp1 = new GetInformation(identity, first_name, last_name, sal); // Object creation
        System.out.print("\n\n\t========= EMPLOYEE: " + emp1.getName() + " =========\n");
        System.out.print("ID: " + emp1.getID());
        System.out.print("\nFirstname: " + emp1.getFirstName());
        System.out.print("\nLastname: " + emp1.getLastName());
        System.out.print("\nSalary per month: " + emp1.getSalary());
        System.out.print("\nAnnual Salary: " + emp1.getAnnualSalary());
        System.out.print("\nSalary(per month) raised by " + percentage + "% : " + emp1.raiseSalary(percentage));
    }
}