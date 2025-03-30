// TODO: Define a class: StringInstrument that is derived from the Instrument class
public class StringInstrument extends Instrument {
   private int stringNum;
   private int fretNum;
   private boolean bowed;
   
   public void setNumOfStrings(int stringNum) {
      this.stringNum = stringNum;
   }
   
   public void setNumOfFrets(int fretNum) {
      this.fretNum = fretNum;
   }
   
   public void setIsBowed(boolean bowed) {
      this.bowed = bowed;
   }
   
   public int getNumOfStrings(){
      return stringNum;   
   }
   
   public int getNumOfFrets(){
      return fretNum;   
   }
   
   public boolean getIsBowed(){
      return bowed;   
   }

}

