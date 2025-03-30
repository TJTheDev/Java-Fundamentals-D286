public class OfferedCourse extends Course {
   // TODO: Declare private fields
   private String instructorName;
   private String location;
   private String classTime;
   
   public void setInstructorName(String instructorName){
      this.instructorName = instructorName;   
   }
   
   public void setLocation(String location){
      this.location = location;   
   }
   
   public void setClassTime(String classTime){
      this.classTime = classTime;   
   }
   
   public String getInstructorName(){
      return instructorName;   
   }
   
   public String getLocation(){
      return location;   
   }
   
   public String getClassTime(){
      return classTime;   
   }

}