### Task: 
Show how to access static and non-static variables through a java program.

### Programming Language: Java

### Output: 
    obj.max will call max variable for the object ==> Maximum value is: 50
    Test.min will print ==> Minimum value is: 10 

### Logic:
    1. In class Test, we are declaring two variables, one static named 'min' and one non-static named 'max'.
    2. All the objects of class 'VariableWithStatic' share the same static variable since they are associated to the class.
    3. Inside the 'VariableWithStatic' class, we are calling the non-static variable using the object of the class.
    4. And, we are calling the static variable using the classnames.

