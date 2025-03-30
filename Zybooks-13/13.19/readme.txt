13.19 LAB*: Program: Pizza party weekend
Program Specifications. Write a program to calculate the cost of hosting three pizza parties on Friday, Saturday and Sunday. Read from input the number of people attending, the average number of slices per person and the cost of one pizza. Dollar values are output with two decimals. For example, System.out.printf("Cost: $%.2f", cost);

Note: this program is designed for incremental development. Complete each step and submit for grading before starting the next step. Only a portion of tests pass after each step but confirm progress.

Step 1 (2 pts). Read from input the number of people (int), average slices per person (double) and cost of one pizza (double). Calculate the number of whole pizzas needed (8 slices per pizza). There will likely be leftovers for breakfast. Hint: Use the Math.ceil() method to round up to the nearest whole number and convert to an integer. Calculate and output the cost for all pizzas. Submit for grading to confirm 1 test passes.
Ex: If the input is:

10  2.6  10.50
The output is:

Friday Night Party
4 Pizzas: $42.00

Step 2 (2 pts). Calculate and output the sales tax (7%). Calculate and output the delivery charge (20% of cost including tax). Submit for grading to confirm 2 tests pass.
Ex: If the input is:

10  2.6  10.50
The output is:

Friday Night Party
4 Pizzas: $42.00
Tax: $2.94
Delivery: $8.99

Step 3 (2 pts). Calculate and output the total including pizza, tax and delivery. Submit for grading to confirm 3 tests pass.
Ex: If the input is:

10  2.6  10.50
The output is:

Friday Night Party
4 Pizzas: $42.00
Tax: $2.94
Delivery: $8.99
Total: $53.93

Step 4 (2 pts). Repeat steps 1 - 3 with additional inputs for Saturday night (one order per line). Maintain and output a separate total for both parties. Submit for grading to confirm 5 tests pass.
Ex: If the input is:

9   2.5   10.95
14   3.2   14.95
The output is:

Friday Night Party
3 Pizzas: $32.85
Tax: $2.30
Delivery: $7.03
Total: $42.18

Saturday Night Party
6 Pizzas: $89.70
Tax: $6.28
Delivery: $19.20
Total: $115.17

Weekend Total: $157.35

Step 5 (2 pts). Repeat steps 1 - 3 with additional inputs for Sunday night (one order per line). Maintain and output a total for all parties. Submit for grading to confirm all tests pass.
Ex: If the input is:

6   2.8   10.95
22   2.1   12.95
12   1.8   14.95
The output is:

Friday Night Party
3 Pizzas: $32.85
Tax: $2.30
Delivery: $7.03
Total: $42.18

Saturday Night Party
6 Pizzas: $77.70
Tax: $5.44
Delivery: $16.63
Total: $99.77

Sunday Night Party
3 Pizzas: $44.85
Tax: $3.14
Delivery: $9.60
Total: $57.59

Weekend Total: $199.53