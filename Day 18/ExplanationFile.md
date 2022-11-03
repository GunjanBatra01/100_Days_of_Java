### Task: 
Show multilevel inheritance through a java program.

### Programming Language: Java

### Output: 
    obj.display() ==> Shape Class
    obj.area() ==> Area method
    obj.volume() ==> Volume method

### Logic:
    1. We have created a class named 'Shape', in which we have defined display() method which prints "Shape Class".
    2. Class 'circle' inherits its parents class i.e. shape class so all the data methods of class shape will be accessible by the class circle.
    3. In class 'circle', we have defined area() method which prints "Area method".
    4. Member functions for class circle will be both area() as well as display(). 
    5. Class 'sphere' inherits 'circle' class so it can inherits all the member functions and member variables of class 'circle'.
    6. Number of member functions accessible by class sphere are three i.e. display(), area(), and volume() method.
    7. In main function, we have created a new object of class 'sphere' named as 'obj'.
    8. For the object obj, we are calling display(), area(), and volume() method.
    9. Since all three are accessible by the class 'sphere', none of the statements will give error.
