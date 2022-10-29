### Task: 
Show static methods using a sample program.

### Programming Language: Java

### Output: 
    obj.display() will call the display method for the object ==> 10 and 50
    Test.statDisplay() will call static method from class Test ==> 10

### Logic:
    1. In class Test, we are initializing two variables, one static named 'min' and one non-static named 'max'.
    2. We are creating a non-static method named display(), which will print the values of min and max. 
    3. display() being a non-static method can access static as well as non-static instance variables.
    4. We are creating a static method named statDisplay(), which will print the value of min.
    5. Since static methods cannot access non-static instance variable, hence it will just access static variable named 'min'.
    6. Inside our main function, we are creating an object of class Test named 'obj'.
    7. For object obj we are calling non-static method display(), so we can call it directly using syntax <objectname.methodname>.
    8. For calling non-static method, we are using the syntax <classname.methodname>.
