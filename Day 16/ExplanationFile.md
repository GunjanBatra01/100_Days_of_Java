### Task: 
Show remaining three usages of this keyword.
        (i) Using this as an argument in the method.
        (ii) Using this as an argument in the constructor call.
        (iii) Using this to return current class instance.

### Programming Language: Java

### Output: 
    Usage 4: This is fourth usage.
    Usage 5: 10
    Usage 6: This is sixth usage.

### USAGE IV: this as an argument in the method
    1. In class thisUsage4, we have defined two methods, display() and display2().
    2. In display() method, we are printing "This is fourth usage".
    3. In display2() method, we are calling display() method with this as a parameter to call the current display method.
    4. In main() function, object of class thisUsage4 has been created.
    5. For object obj, we are calling display2() method.

### USAGE V: this as an argument in the constructor call
    1. In class useFive, we are creating an object of class thisUsage5 named obj.
    2. We are creating parameterized constructor in which we are refering to the current object.
    3. In display() method, we are printing the data of object.
    4. In thisUsage5 class, we are initializing the value of data as 10.
    5. We are creating a default constructor, in which we are creating an object named 'five' of class useFive with this as parameter.
    6. For the object five, we are calling the display method().
    7. In main function, we have created an object named 'a' of class thisUsage5.
    8. With execution of statement in main function, first it will create the object a, then it will call the default constructor thisUsage5. In this five object will be created for which display function will be called which will print the value of data.

### USAGE VI: this to return current class instance
    1. In class Test, we are creating an instance method getTest() which will return current class instance.
    2. We have created a method display(), which will print "This is sixth usage.".
