### Task: 
Show three usages of this keyword in Java

### Programming Language: Java

### Output: 
    Usage 1: Sum is: 7
    Usage 2: This is B
             This is A
    Usage 3: This is third usage
             This is 3

### USAGE I: Refer current class instance variable
    1. In first usage, this keyword is used to refer current class instance variable.
    2. We have created a class named 'useOne' in which we have two instance variables, one constructor, and one method.
    3. In constructor we are taking two variables x and y as parameters which we are referening to the same instance variable declared for the class.
    4. In sum() method, we are printing the sum of x and y.
    5. In main() function, we are creating an object of class 'useOne' named 'obj' through which we are calling parameterized constructor with x=3 and y=4.
    6. For the object obj, we are calling sum() method.


### USAGE II: Invoke current class method
    1. In second usage, this keyword is used to invoke current class method.
    2. We have created a class named 'useTwo' in which we have defined two methods.
    3. In displayA() method, we are printing "This is A".
    4. In displayB() method, we are printing "This is B" and we are invoking displayA() method using this keyword.
    5. So whenever displayB() method will be called, first it will print "This is B" and then it will call displayA() method printing "This is A".
    6. In our main function, we are creating an object obj of class useTwo.
    7. For the object obj, we are calling the displayB() method.

### USAGE III: Invoke current class constructor
    1. In third usage, this keyword is used to invoke current class constructor.
    2. We have created a class named 'useThree' in which we have defined two constructors, one default and another parameterized.
    3. In default constructor, we are printing "This is third usage".
    4. In parameterized constructor, we are using this along with () so that it invoke default constructor.
    5. After that we are printing the value of x.
    6. In main function, we are creating an object obj of class useThree invoking parameterized constructor with 3 as parameter.
