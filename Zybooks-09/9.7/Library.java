import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Library {

   public static void fillLibraries(LinkedListLibrary linkedListLibrary, ArrayListLibrary arrayListLibrary) throws IOException {
      FileInputStream fileByteStream = null; // File input stream
      Scanner inFS = null;                   // Scanner object
      int linkedListOperations = 0;
      int arrayListOperations = 0;

      BookNode currNode;
      Book tempBook;

      String bookTitle;
      String bookAuthor;
      long bookISBN;

      // Try to open file
      fileByteStream = new FileInputStream("Books.txt");
      inFS = new Scanner(fileByteStream);

      while (inFS.hasNextLine()) {
         bookTitle = inFS.nextLine();
         bookISBN = inFS.nextLong();
         inFS.nextLine();
         bookAuthor = inFS.nextLine();

         // Insert into linked list
         currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
         linkedListOperations = linkedListLibrary.insertSorted(currNode, linkedListOperations);
         linkedListLibrary.lastNode = currNode;

         // Insert into ArrayList
         tempBook = new Book(bookTitle, bookAuthor, bookISBN);
         arrayListOperations = arrayListLibrary.insertSorted(tempBook, arrayListOperations);
      }

      fileByteStream.close(); // close() may throw IOException if fails
   }

   // ✅ MAIN METHOD GOES INSIDE THE CLASS
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      int linkedListOperations = 0;
      int arrayListOperations = 0;

      // Create libraries
      LinkedListLibrary linkedListLibrary = new LinkedListLibrary();
      ArrayListLibrary arrayListLibrary = new ArrayListLibrary();

      // Fill libraries with 100 books
      fillLibraries(linkedListLibrary, arrayListLibrary);

      // Create new book to insert into libraries
      BookNode currNode;
      Book tempBook;

      String bookTitle;
      String bookAuthor;
      long bookISBN;

      bookTitle = scnr.nextLine();
      bookISBN = scnr.nextLong();
      scnr.nextLine(); // Consume newline
      bookAuthor = scnr.nextLine();

      // Insert into linked list and count operations
      currNode = new BookNode(bookTitle, bookAuthor, bookISBN);
      linkedListOperations = linkedListLibrary.insertSorted(currNode, 0);
      linkedListLibrary.lastNode = currNode;

      // Insert into array list and count operations
      tempBook = new Book(bookTitle, bookAuthor, bookISBN);
      arrayListOperations = arrayListLibrary.insertSorted(tempBook, 0);

      // Output results
      System.out.println("Number of linked list operations: " + linkedListOperations);
      System.out.println("Number of ArrayList operations: " + arrayListOperations);
   }
}
