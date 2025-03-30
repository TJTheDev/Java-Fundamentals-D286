import java.util.Scanner;

public class Playlist {

   public static void printMenu(String playlistTitle) {
      System.out.println(playlistTitle + " PLAYLIST MENU");
      System.out.println("a - Add song");
      System.out.println("d - Remove song");
      System.out.println("c - Change position of song");
      System.out.println("s - Output songs by specific artist");
      System.out.println("t - Output total time of playlist (in seconds)");
      System.out.println("o - Output full playlist");
      System.out.println("q - Quit");
      System.out.println();
   }

   public static SongEntry executeMenu(char option, String playlistTitle, SongEntry headNode, Scanner scnr) {
      switch (option) {
         case 'o':  // Output full playlist
            System.out.println(playlistTitle + " - OUTPUT FULL PLAYLIST");
            if (headNode == null) {
               System.out.println("Playlist is empty\n");
            } else {
               int position = 1;
               SongEntry current = headNode;
               while (current != null) {
                  System.out.println(position + ".");
                  current.printPlaylistSongs();
                  System.out.println();
                  current = current.getNext();
                  position++;
               }
            }
            break;
   
         case 'a': // Add song
            System.out.println("ADD SONG");
            System.out.println("Enter song's unique ID:");
            String id = scnr.nextLine();
            System.out.println("Enter song's name:");
            String name = scnr.nextLine();
            System.out.println("Enter artist's name:");
            String artist = scnr.nextLine();
            System.out.println("Enter song's length (in seconds):");
            int length = scnr.nextInt();
            scnr.nextLine(); // consume newline
   
            SongEntry newSong = new SongEntry(id, name, artist, length);
            if (headNode == null) {
               headNode = newSong;
            } else {
               SongEntry current = headNode;
               while (current.getNext() != null) {
                  current = current.getNext();
               }
               current.setNext(newSong);
            }
            System.out.println();
            break;
   
         case 'd': // Remove song
            System.out.println("REMOVE SONG");
            System.out.println("Enter song's unique ID:");
            String removeId = scnr.nextLine();
   
            SongEntry prev = null;
            SongEntry curr = headNode;
            while (curr != null && !curr.getID().equals(removeId)) {
               prev = curr;
               curr = curr.getNext();
            }
   
            if (curr != null) {
               if (prev == null) {
                  headNode = curr.getNext(); // remove head
               } else {
                  prev.setNext(curr.getNext());
               }
               System.out.println("\"" + curr.getSongName() + "\" removed.\n");
            }
            break;
   
         case 'c': // Change position
            System.out.println("CHANGE POSITION OF SONG");
            System.out.println("Enter song's current position:");
            int currentPos = scnr.nextInt();
            System.out.println("Enter new position for song:");
            int newPos = scnr.nextInt();
            scnr.nextLine(); // consume newline
   
            if (headNode == null || headNode.getNext() == null) break;
   
            SongEntry prevNode = null;
            SongEntry nodeToMove = headNode;
            int index = 1;
   
            while (nodeToMove != null && index < currentPos) {
               prevNode = nodeToMove;
               nodeToMove = nodeToMove.getNext();
               index++;
            }
   
            if (nodeToMove == null) break;
   
            if (prevNode == null) {
               headNode = headNode.getNext();
            } else {
               prevNode.setNext(nodeToMove.getNext());
            }
   
            if (newPos <= 1) {
               nodeToMove.setNext(headNode);
               headNode = nodeToMove;
            } else {
               SongEntry current = headNode;
               int i = 1;
               while (current.getNext() != null && i < newPos - 1) {
                  current = current.getNext();
                  i++;
               }
               nodeToMove.setNext(current.getNext());
               current.setNext(nodeToMove);
            }
   
            System.out.println("\"" + nodeToMove.getSongName() + "\" moved to position " + newPos + "\n");
            break;
   
         case 's': // Output songs by specific artist
            System.out.println("OUTPUT SONGS BY SPECIFIC ARTIST");
            System.out.println("Enter artist's name:");
            String artistName = scnr.nextLine();
   
            SongEntry current = headNode;
            int pos = 1;
            while (current != null) {
               if (current.getArtistName().equals(artistName)) {
                  System.out.println(pos + ".");
                  current.printPlaylistSongs();
                  System.out.println();
               }
               current = current.getNext();
               pos++;
            }
            break;
   
         case 't': // Output total time
            System.out.println("OUTPUT TOTAL TIME OF PLAYLIST (IN SECONDS)");
            int totalTime = 0;
            SongEntry node = headNode;
            while (node != null) {
               totalTime += node.getSongLength();
               node = node.getNext();
            }
            System.out.println("Total time: " + totalTime + " seconds\n");
            break;
   
         default:
            break;
      }
   
      return headNode;
   }


   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      SongEntry headNode = null;

      System.out.println("Enter playlist's title:");
      String playlistTitle = scnr.nextLine();
      System.out.println();

      char option = ' ';
      while (option != 'q') {
         printMenu(playlistTitle);
         System.out.println("Choose an option:");
         option = scnr.nextLine().toLowerCase().charAt(0);

         while ("adcstoq".indexOf(option) == -1) {
            System.out.println("Choose an option:");
            option = scnr.nextLine().toLowerCase().charAt(0);
         }

         if (option != 'q') {
            headNode = executeMenu(option, playlistTitle, headNode, scnr);
         }
      }
   }
}
