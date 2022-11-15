### Task: 
    Write a code so that it outputs the area of a parallelogram with breadth B and height H. You should read the variables from the standard input. If B<=0 or H<=0, the output should be "java.lang.Exception: Breadth and height must be positive" without quotes.

### Programming Language: Java

### Input:
    There are two lines of input. The first line contains B: the breadth of the parallelogram. The next line contains H: the height of the parallelogram.

### Output: 
    If both values are greater than zero, then the main method must output the area of the parallelogram. Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

### Test Cases:
    Case 1:
        Sample Input:
            1
            3
        Sample Output:
            3

    Case 2:
        Sample Input:
            -1
            2
        Sample Output:
            java.lang.Exception: Breadth and height must be positive

### Logic:
    1. Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
    2. It is executed before main() regardless of the fact whether main() is written before or after.
