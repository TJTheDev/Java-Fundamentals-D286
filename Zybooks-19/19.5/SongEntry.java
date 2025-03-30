public class SongEntry {
   private String uniqueID;
   private String songName;
   private String artistName;
   private int songLength;
   private SongEntry nextNode;

   // Default constructor
   public SongEntry() {
      this.uniqueID = "none";
      this.songName = "none";
      this.artistName = "none";
      this.songLength = 0;
      this.nextNode = null;
   }

   // Parameterized constructor
   public SongEntry(String id, String name, String artist, int length) {
      this.uniqueID = id;
      this.songName = name;
      this.artistName = artist;
      this.songLength = length;
      this.nextNode = null;
   }

   // Insert after current node
   public void insertAfter(SongEntry currNode) {
      SongEntry temp = this.nextNode;
      this.nextNode = currNode;
      currNode.nextNode = temp;
   }

   // Set next node
   public void setNext(SongEntry nextNode) {
      this.nextNode = nextNode;
   }

   // Accessors
   public String getID() {
      return this.uniqueID;
   }

   public String getSongName() {
      return this.songName;
   }

   public String getArtistName() {
      return this.artistName;
   }

   public int getSongLength() {
      return this.songLength;
   }

   public SongEntry getNext() {
      return this.nextNode;
   }

   // Print song info
   public void printPlaylistSongs() {
      System.out.println("Unique ID: " + uniqueID);
      System.out.println("Song Name: " + songName);
      System.out.println("Artist Name: " + artistName);
      System.out.println("Song Length (in seconds): " + songLength);
   }
}
