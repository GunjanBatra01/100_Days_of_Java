### Task: 
We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods.

### Programming Language: Java

### Output: 
    
    Area of Rectangle : Double
    Area of Square : Double
    Area of Circle : Double

### Logic:

(i) We have created an abstract class named "Shape" in which we have declared three methods.

(ii) Since these methods are abstract, we need to define them outside the abstract class, and for that we have created a class named "Area" which is extending the class "Shape".

(iii) In class Area, we are defining each method with necessary printing statement.

(iv) In main function, we are creating 3 objects s1, s2, and s3 of class Shape.

(v) Then we are using s1, s2, and s3 as reference variable to class Area.

(vi) For each different object, we are calling different methods with particular values of parameters.
