19.4 LAB: Warm up: Contacts
A linked list is built in this lab. Make sure to keep track of the head node.

(1) Complete two files to submit.

ContactNode.java - Class definition
ContactList.java - Contains main() method
(2) Build the ContactNode class per the following specifications:

Private fields
String contactName
String contactPhoneNumber
ContactNode nextNodePtr
Constructor with parameters for name followed by phone number (1 pt)
Public member methods
getName() - Accessor (1 pt)
getPhoneNumber() - Accessor (1 pt)
insertAfter() (2 pts)
getNext() - Accessor (1 pt)
printContactNode()
Ex: If the name is Roxanne Hughes and the phone number is 443-555-2864, printContactNode() outputs:

Name: Roxanne Hughes
Phone number: 443-555-2864
(3) Define main() to read the name and phone number for three contacts and output each contact. Create three ContactNodes and use the nodes to build a linked list. (2 pts)

Ex: If the input is:

Roxanne Hughes
443-555-2864
Juan Alberto Jr.
410-555-9385
Rachel Phillips
310-555-6610
the output is:

Person 1: Roxanne Hughes, 443-555-2864
Person 2: Juan Alberto Jr., 410-555-9385
Person 3: Rachel Phillips, 310-555-6610
(4) Output the linked list using a loop to output contacts one at a time. (2 pts)

Ex:

CONTACT LIST
Name: Roxanne Hughes
Phone number: 443-555-2864

Name: Juan Alberto Jr.
Phone number: 410-555-9385

Name: Rachel Phillips
Phone number: 310-555-6610