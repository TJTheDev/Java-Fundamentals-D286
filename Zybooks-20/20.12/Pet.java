public class Pet {
   private String name;
   private String type;
   private int age;
    // TODO: Declare private fields 
    
   public Pet() {
      name = "unknown";
      type = "unknown";
      age = 0;
   }
   
   public Pet(String name, String type, int age) {
      this.age = age;
      this.type = type;
      this.name = name;
   }
   
   public int getAge(){
      return age;   
   }
   
   public void setAge(int age) {
      this.age = age;
   }
   
   public String getType(){
      return type;   
   }
   
   public void setType(String type) {
      this.type = type;
   }
   
      public String getName(){
      return name;   
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
}