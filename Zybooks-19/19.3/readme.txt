19.3 LAB: Is list sorted
Given the IntNode class, define the isSorted() method in the CustomLinkedList class that takes the head node of a linked list as a parameter and determines if the numbers in the list are in ascending order. isSorted() returns true if the list is in ascending order, has only one item, or is empty; otherwise, isSorted() returns false.

Ex: If the list contains:

head -> 14 -> 19 -> 22 -> 99
isSorted(headObj) returns true.

Ex: If the list contains:

head -> 14 -> 19 -> 22 -> 99 -> 14 -> 100
isSorted(headObj) returns false.

Ex: If the list contains:

head -> 
isSorted(headObj) returns true.