14.15 LAB*: Program: Income tax form
Program Specifications Write a program to calculate U.S. income tax owed given wages, taxable interest, unemployment compensation, status (single or married) and taxes withheld. Taxpayers are only allowed to use this short form if adjusted gross income (AGI) is less than $120,000. Dollar amounts are displayed as integers with comma separators. For example, System.out.printf("Cost: $%,d", cost);

Note: this program is designed for incremental development. Complete each step and submit for grading before starting the next step. Only a portion of tests pass after each step but confirm progress.

Step 1 (2 pts). Input wages, taxable interest, unemployment compensation, status (1=single and 2=married) and taxes withheld as integers. Calculate and output AGI (wages + interest + unemployment). Output error message if AGI is above $120,000 and the program stops with no additional output. Submit for grading to confirm two tests pass.
Ex: If the input is:

20000  23  500  1  400
The output is:

AGI: $20,523
Ex: If the input is:

120000  23  500  1  400
The output is:

AGI: $120,523
Error: Income too high to use this form

Step 2 (3 pts). Identify deduction amount based on status: (1) Single=$12,000 or (2) Married=$24,000. Set status to 1 if not input as 1 or 2. Calculate taxable income (AGI - deduction). Set taxable income to zero if negative. Output deduction and taxable income. Submit for grading to confirm five tests pass.
Ex: If the input is:

20000  23  500  1  400
Ex: The additional output is:

AGI: $20,523
Deduction: $12,000
Taxable income: $8,523

Step 3 (3 pts). Calculate tax amount based on exemption and taxable income (see tables below). Tax amount should be stored as a double and rounded to the nearest whole number using Math.round(). Submit for grading to confirm eight tests pass.
Ex: If the input is:

20000  23  500  1  400
Ex: The additional output is:

AGI: $20,523
Deduction: $12,000
Taxable income: $8,523
Federal tax: $852
Income	Tax for Single Filers
$0 - $10,000	10% of the income
$10,001 - $40,000	$1,000 + 12% of the amount over $10,000
$40,001 - $85,000	$4,600 + 22% of the amount over $40,000
over $85,000	$14,500 + 24% of the amount over $85,000
Income	Tax for Married Filers
$0 - $20,000	10% of the income
$20,001 - $80,000	$2,000 + 12% of the amount over $20,000
over $80,000	$9,200 + 22% of the amount over $80,000

Step 4 (2 pts). Calculate amount of tax due (tax - withheld). If the amount due is negative the tax payer receives a refund. Output tax due or tax refund as positive values. Submit for grading to confirm all tests pass.
Ex: If the input is:

80000  0  500  2  12000
Ex: The additional output is:

AGI: $80,500
Deduction: $24,000
Taxable income: $56,500
Federal tax: $6,380
Tax refund: $5,620