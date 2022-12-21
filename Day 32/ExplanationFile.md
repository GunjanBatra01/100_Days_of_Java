### Task: 
Write a program to reverse each word of the string entered by the user. It should be reversed even if the string consist of numbers or symbols.

### Programming Language: Java

### Input: 
  String variable

### Output: 
  String variable but reversed as entered by the user.

### Test Cases:

**Case 1:**
Literal String

	Input: "This is my Day 32"  
	Output: siht si ym yaD 23

**Case 2:**
Number

	Input: 23521  
	Output: 12532

**Case 3:**
Symbols

	Input: @#$%^  
	Output: ^%$#@

### Logic:
(i) In function reverseEachWordInString(), we are taking string as an input so we set it as an argument to the function.  

(ii) Then we have used split function in line 5 to segregate the string words as a regular expression arrives such as whitespace, and since we don't want any limit for the regular expression we have used regex.  

(iii) We have created a String variable revString with is initialised as an empty string and will store the reversed string.  

(iv) In for loop, we are traversing the whole string letter by letter, and while traversing we are adding the traversed letter or digit or symbol in the revered string.  

(v) As new letter is traversed, it is added to the start of string due to the indexing which is decrementing with the use of variable j.  

(vi) In our main function, we are asking user to enter a string and then we are passing the same string as input to the reverseEachWordInString() function.
