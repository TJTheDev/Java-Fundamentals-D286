15.16 LAB*: Program: Rock paper scissors
Program Specifications Write a program to play an automated game of Rock, Paper, Scissors. Two players make one of three hand signals at the same time. Hand signals represent a rock, a piece of paper, or a pair of scissors. Each combination results in a win for one of the players. Rock crushes scissors, paper covers rock, and scissors cut paper. A tie occurs if both players make the same signal. Use a random number generator of 0, 1, or 2 to represent the three signals.

Note: this program is designed for incremental development. Complete each step and submit for grading before starting the next step. Only a portion of tests pass after each step but confirm progress.

Step 0. Read starter template and do not change the provided code. Integer constants are defined for ROCK, PAPER, and SCISSORS. A Random object is created and a seed is read from input and passed to the Random object. This supports automated testing and creates predictable results that would otherwise be random.

Step 1 (2 pts). Read two player names from input (String). Read number of rounds from input. Continue reading number of rounds if value is below one and provide an error message. Output player names and number of rounds. Submit for grading to confirm 2 tests pass.
Ex: If input is:

3 Anna Bert -3 -4 4
Sample output is:

Rounds must be > 0
Rounds must be > 0
Anna vs Bert for 4 rounds

Step 2 (2 pts). Generate random values (0 - 2) for player 1 followed by player 2 by calling rand.nextInt(3). Continue to generate random values for both players until both values do not match. Output "Tie" when the values match. Submit for grading to confirm 3 tests pass.
Ex: If input is:

9 Anna Bert 1
Sample output is:

Anna vs Bert for 1 rounds
Tie
Tie

Step 3 (3 pts). Identify winner for this round and output a message. Rock crushes scissors, scissors cut paper, and paper covers rock. Submit for grading to confirm 6 tests pass.
Ex: If input is:

17 Anna Bert 1
Sample output is:

Anna vs Bert for 1 rounds
Tie
Bert wins with scissors

Step 4 (3 pts). Add a loop to repeat steps 2 and 3 for the number of rounds. Output total wins for each player after all rounds are complete. Submit for grading to confirm all tests pass.
Ex: If input is:

82 Anna Bert 3
Sample output is:

Anna vs Bert for 3 rounds
Anna wins with paper
Anna wins with paper
Tie
Tie
Anna wins with rock
Anna wins 3 and Bert wins 0