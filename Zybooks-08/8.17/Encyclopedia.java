public class Encyclopedia extends Book {
   private String edition;
   private int numPages;
   
   
   public void setEdition(String edition) {
      this.edition = edition;   
   }
   
   public void setNumPages(int numPages) {
      this.numPages = numPages;   
   }
   
   public String getEdition() {
      return edition;   
   }
   
   public int getNumPages() {
      return numPages;   
   }
   
   @Override
   public void printInfo() {
      System.out.println("Book Information: ");
      System.out.println("   Book Title: " + title);
      System.out.println("   Author: " + author);
      System.out.println("   Publisher: " + publisher);
      System.out.println("   Publication Date: " + publicationDate);
      System.out.println("   Edition: " + edition);
      System.out.println("   Number of Pages: " + numPages);
   }
   
}