### Task: 
Depict hierarchical inheritance using a sample program in java.

### Programming Language: Java

### Output: 
    Chocolate class - Super Class
    White Chocolate - Child Class 1

    Chocolate class - Super Class
    Dark Chocolate - Child Class 2

    Chocolate class - Super Class
    Milk Chocolate - Child Class 3

### Logic:
    1. In class Chocolate, we have defined a function named 'display()' which prints "Chocolate class - Super Class".
    2. WhiteChocolate class extends Chocolate class so it will inherit all the data members and functions of class Chocolate.
    3. Number of data functions accessible by class WhiteChocolate are two i.e. display() and show(), in which show method is defined in WhiteChocolate class itself.
    4. DarkChocolate class extends Chocolate class so it will inherit all the data members and functions of class Chocolate.
    5. Number of data functions accessible by class DarkChocolate are two i.e. display() and show(), in which show method is defined in DarkChocolate class itself.
    6. MilkChocolate class extends Chocolate class so it will inherit all the data members and functions of class Chocolate.
    7. Number of data functions accessible by class MilkChocolate are two i.e. display() and show(), in which show method is defined in MilkChocolate class itself.
    8. In main function, we have created three objects obj1, obj2, and obj3.
    9. For all the objects, we are calling display() and show() method.
