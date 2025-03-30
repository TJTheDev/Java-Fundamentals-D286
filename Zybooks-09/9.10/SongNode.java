public class SongNode {
   private String songTitle;
   private int songLength;
   private String songArtist;
   private SongNode nextNodeRef;

   public SongNode() {
      songTitle = "";
      songLength = 0;
      songArtist = "";
      nextNodeRef = null;
   }

   public SongNode(String songTitleInit, int songLengthInit, String songArtistInit) {
      this.songTitle = songTitleInit;
      this.songLength = songLengthInit;
      this.songArtist = songArtistInit;
      this.nextNodeRef = null;
   }

   public SongNode(String songTitleInit, int songLengthInit, String songArtistInit, SongNode nextLoc) {
      this.songTitle = songTitleInit;
      this.songLength = songLengthInit;
      this.songArtist = songArtistInit;
      this.nextNodeRef = nextLoc;
   }

   public void insertAfter(SongNode nodeLoc) {
      SongNode tmpNext;
      tmpNext = this.nextNodeRef;
      this.nextNodeRef = nodeLoc;
      nodeLoc.nextNodeRef = tmpNext;
   }

   public SongNode getNext() {
      return this.nextNodeRef;
   }

   // Print song info
   public void printSongInfo() {
      System.out.println("Title: " + this.songTitle);
      System.out.println("Length: " + this.songLength);
      System.out.println("Artist: " + this.songArtist);
      System.out.println();
   }
}
