15.15 LAB*: Program: Drawing a half arrow
Program Specifications Write a program that outputs a downwards facing arrow composed of a rectangle and a right triangle. Arrow dimensions are defined by user specified arrow base height, arrow base width, and arrow head width.

Note: this program is designed for incremental development. Complete each step and submit for grading before starting the next step. Only a portion of tests pass after each step but confirm progress.

Step 1 (3 pts). Input the arrow base height (int) and width (int). Draw a rectangle using asterisks (height x width). Hint: use a nested loop in which the inner loop draws one row of *s, and the outer loop iterates a number of times equal to the height. Submit for grading to confirm two tests pass.

Ex: If input is:

6 4
Sample output is:

****
****
****
****
****
****
Step 2 (3 pts). Input the arrow head width and draw a right triangle. Hint: use a nested loop. Submit for grading to confirm four tests pass.

Ex: If input is:

4 3 4
Sample output is:

***
***
***
***
****
***
**
*
Step 3 (4 pts). Modify the program to only accept an arrow head width that is larger than the arrow base width. Use a loop to continue inputting the arrow head width until the value is larger than the arrow base width. Submit for grading to confirm all tests pass.

Ex: If input is:

4 3 3 2 4
Sample output is:

***
***
***
***
****
***
**
*