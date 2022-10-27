### Task: 
Show constructor overloading through a sample program.

### Programming Language: Java

### Output: 
    While creation of object 'obj', default constructor will be called ===> Inside 1st Constructor
    While creation of object 'obj1', constructor with single parameter will be called ===> Inside 2nd Constructor
    While creation of object 'obj2', constructor with two parameters will be called ===> Inside 3rd Constructor
    display() function will be called for obj ==> a=10, b=20
    display() function will be called for obj1 ==> a=40, b=0
    display() function will be called for obj2 ==> a=30, b=60

### Logic:
    1. In class Construct_Overload, first we are declaring two integer variables named a and b.
    2. Under this class, we have created a default constructor which is initializing values of a & b and displaying their respective values.
    3. Then, we have created a constructor with single parameter which is initializing the value of a but will print the values of both a and b where b will be equal to 0.
    4. In third constructor, we have given two parameters a and b. Inside the constructor, we are printing their respective values.
    5. Inside main function, we are creating three different objects obj, obj1, and obj2.
    6. For all three different objects we are refering to different constructors.
    7. display() function is called for all three objects, displaying the values of a and b.
