### Task: 
Write a java program to print the area of rectangle by creating a class named 'Area'. Construct a customized class with two method named as 'setDim' takes dimensions as parameters and the second method named as 'getArea' return the area of rectangle. Take length and breadth from user.

### Programming Language: Java

### Input:
    l = length of rectangle
    b = breadth of rectangle
    Both can be floating point integers also.

### Output: 
    area = length * breadth
    "Area of rectangle with sides (length) and (breadth) is: (area) sq. units"

### Test Cases:

    Case 1: 
            Dimensions are integer
            l = 12, b = 3

    Case 2: 
            Dimensions are decimals
            l = 2.6, b = 3.2

### Logic:
    1. First, we have created a customized class named CalRectArea which is calculating the area of rectangle.
    2. Inside CalRectArea class, we are declaring three data variables length, breadth, and area of data type double since the length and breadth of a rectangle can be in decimals also.
    3. After data variables declaration, we are creating two methods. First one, setDim(length, breadth) which is initializing the value of length and breadth of rectangle object using this keyword refering to the current object.
    4. Second method definition is for getArea(), which is calculating and printing the area of rectangle using *(multiplication) operator between length and breadth.
    5. In our class Area, we are calling our main function from where the execution will start.
    6. Inside main function, first we are asking user to input length and breadth using Scanner class.
    7. After that, we are creating an object named r1 of class CalRectArea on line 24.
    8. Using dot opertor, we are calling the respective functions for r1 object.
