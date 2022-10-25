### Task: 
Create a class named Employee, which models an employee id, firstname, lastname, salary, annual salary, and salary after raising by specific percentage. 

### Programming Language: Java

### Input:
    Employee id: integer
    Employee firstname: String
    Employee lastname: String
    Employee salary: integer
    Employee salary increment percentage: integer

### Output: 
    All information about the employee:
        ID:
        Firstname:
        Lastname:
        Salary per month:
        Annual Salary:
        Salary(per month) after increment:

### Logic:
    1. We are creating a customized class named GetInformation, in which we are defining following things:
        (i) Parameterized Constructor which is initializing values of id, firstname, lastname, salary.
        (ii) getID() method which will return the id of the employee.
        (iii) getFirstName() method which will return the firstname of the employee.
        (iv) getLastName() method which will return the lastname of the employee.
        (v) getName() method will concatenate firstname and lastname.
        (vi) getSalary() method will return monthly salary of the employee.
        (vii) getAnnualSalary() method will return the annual salary of the employee.
        (viii) raiseSalary() method will increment the monthly salary of the employee by the specified percentage
    2. In class Employee, we are calling main function under which first we are asking user to enter employee details such as id, firstname, lastname, salary, raise percentage.
    3. After asking user for employee credentials, we are creating an object named emp1 of class GetInformation.
    4. For the created object, we are calling methods of the class GetInformation which will display the information of the employee.
