package j123;
//Made by James Dumitru
import java.util.List;
public class Instructors {
   //constants
   protected static final int HIGH_Level_Knowledge = 3;
   protected static final int MEDIUM_Level_Knowledge = 2;
   protected static final int PRIMARY_Level_Knowledge = 1;
   protected static final int HIGH_Level_Budget = 5000;
   protected static final int MEDIUM_Level_Budget = 1000;
   protected static final int PRIMARY_Level_Budget = 900;
   protected static final String NEW_Classroom_EXT = " NEW CLASSROOM ";
   protected static final String OLD_Classroom_EXT = " OLD CLASSROOM ";
   //Variables
   private String instructorName;
   private double teachingBudget; //the budget also needs work on as well!!
   private String locationOfClass;
   private int levelOfKnowledge;
   private List<String> teachingMaterials;
   public Instructors() {
       super();
   }
   public Instructors(String instructorName, List<String> teachingMaterials) {
       super();
       this.instructorName = instructorName;
       this.teachingMaterials = teachingMaterials;
   }
   public String getInstructorName() {
       return instructorName;
   }
   protected void setInstructorName(String instructorName) {
       this.instructorName = instructorName;
   }
   public double getTeachingBudget() {
       return teachingBudget;
   }
   protected void setTeachingBudget(double teachingBudget) {
       this.teachingBudget = teachingBudget;
   }
   public String getLocationOfClass() {
       return locationOfClass;
   }
   protected void setLocationOfClass(String locationOfClass) {
       this.locationOfClass = locationOfClass;
   }
   public int getLevelOfKnowledge() {
       return levelOfKnowledge;
   }
   protected void setLevelOfKnowledge(int levelOfKnowledge) {
       this.levelOfKnowledge = levelOfKnowledge;
   }
   public List<String> getTeachingMaterials() {
       return teachingMaterials;
   }
   protected void setTeachingMaterials(List<String> teachingMaterials) {
       this.teachingMaterials = teachingMaterials;
   }
   @Override
   //posted long way
   public String toString() {
       return " Instructor" + " \n" +"[ instructorName = " + instructorName + ", teachingBudget = " + teachingBudget
               + ", locationOfClass = " + locationOfClass + ", levelOfKnowledge = " + levelOfKnowledge
               + ", teachingMaterials = " + teachingMaterials + "]";
   }//comes out in a line for Instructors, Spartans, and Athenians as a test
}