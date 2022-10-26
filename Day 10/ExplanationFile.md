### Task: 
Create a class 'Bikes' depicting both default and parameterized constructor. In paramerized constructor, print the bike type. 

### Programming Language: Java

### Input:
    Bike type: String

### Output: 
    This is default constructor
    This is <bike_type>

### Test Cases:

    Case 1: Bike Type = Chopper (anyone from the available options)
            ==> It will satisfy the if condition of paramerized contructor so it will print "This is Chopper".

    Case 2: Bike Type = Cycle (apart from available options)
            ==> It will satisfy the else condition so it will print "Please enter a valid choice".

    Case 3: Bike Type = @/20/null
            ==> It will also print "Please enter a valid choice".

### Logic:
    1. Constructors name is same as class name and also they don't have any explicit return type.
    2. First, we have created a class 'Bikes' in which we have created two constructors, one default i.e. with no parameters and one parameterized i.e. type as its parameter.
    3. In default constructor, we are simply printing "This is default constructor".
    4. In paramerized constructor, we are printing the type of bike.
    5. In our main function under 'Demo' class, we are object 'sc' of Scanner class to take bike type as input from user which will be stored in a string variable 'bike_type'.
    6. We are creating two objects b1 and b2, for b1 we are calling default constructor and for b2 we are calling parameterized constructor. 
