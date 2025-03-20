/*
Write a program that reads a list of words. Then, the program outputs those words and their frequencies. The input begins with an integer indicating the number of words that follow. Assume that the list will always contain fewer than 20 words.

Ex: If the input is:

5 hey hi Mark hi mark
the output is:

hey - 1
hi - 2
Mark - 1
hi - 2
mark - 1
Hint: Use two arrays, one array for the strings and one array for the frequencies.
*/

import java.util.Scanner;

public class LabProgram {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        int numWords = scnr.nextInt();  // Read the number of words
        String[] arrayList = new String[numWords]; // Store words
        int[] intCount = new int[numWords]; // Store word frequencies

        // Read words into the array
        for (int i = 0; i < numWords; i++) {
            arrayList[i] = scnr.next();
        }

        // Compute frequency of each word
        for (int i = 0; i < numWords; i++) {
            intCount[i] = 1; // Initialize count to 1
            for (int j = 0; j < numWords; j++) {
                if (i != j && arrayList[i].equals(arrayList[j])) {
                    intCount[i]++;
                }
            }
        }

        // Print results in original input order
        for (int i = 0; i < numWords; i++) {
            System.out.println(arrayList[i] + " - " + intCount[i]);
        }
    }
}


