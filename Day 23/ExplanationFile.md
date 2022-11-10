### Task: 
    Java's System.out.printf function can be used to print formatted output. 
    The purpose of this exercise is to test your understanding of formatting output using printf. To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.

### Programming Language: Java

### Input: 
    Every line of input will contain a String followed by an integer. Each String will have a maximum of 10 alphabetic characters, and each integer will be in the inclusive range from 0 to 999.

    java 100
    cpp 65
    python 50

### Output: 
    In each line of output there should be two columns:
        The first column contains the String and is left justified using exactly 15 characters.
        The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

    ================================
    java           100 
    cpp            065 
    python         050 
    ================================

### Test Cases:

    Case 1:
        Input:
            java 100
            cpp 65
            python 50
        Output:
            ================================
            java           100 
            cpp            065 
            python         050 
            ================================

    Case 2:
        Input:
            h 0
            hackerrank 0
            abcdefgaaa 999
        Output:
            ================================
            h              000 
            hackerrank     000 
            abcdefgaaa     999 
            ================================
            
    Case 3:
        Input:
            hello 0
            hackerrank 65
            java 10
        Output:
            ================================
            hello          000 
            hackerrank     065 
            java           999 
            ================================


### Logic:
    1. Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.
    2. In main function, we are creating an object sc of class Scanner since we need to take inputs from user.
    3. 'For' loop statements will get executed from i=0 to i=2, since we need to take input three times.
    4. We are taking a string as an input in variable named s1.
    5. We are taking an integer as an input in variable named x.
    6. We have used System.out.printf function to print formatted output.
    7. %-14s depicts fifteen characters left-justified string from 0 to 14.
    8. %03d padding with leading zero for digits.
