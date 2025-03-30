14.11 LAB: Comparing doubles
Write a program that is given two doubles for comparison and a third double that is a difference threshold, called epsilon. Output one of three phrases:

output "equal" if the doubles are within 0.001 (exclusively) of each other

output "close enough" if the doubles are within epsilon (exclusively) of each other

output "not close" if doubles are not within epsilon

Note: End each output statement with a newline.

Ex: If the input is:

14.1 14.2 0.2
the output is:

close enough
Ex: If the input is:

2.1125 2.1132 0.02
the output is:

equal
Ex: If the input is:

5.1 5.0 0.05
the output is:

not close