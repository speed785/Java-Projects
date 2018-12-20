package j123;
//Made by James Dumitru
import java.util.List;
public class Spartans extends Instructors {
   public Spartans() {
	   
       super();
   }
   public Spartans(String instructorName, List<String> teachingMaterials) {
       super(instructorName, teachingMaterials);
   }
   @Override
   public void setLevelOfKnowledge(int levelOfKnowledge) {
       if (levelOfKnowledge >= HIGH_Level_Knowledge) {
           super.setLevelOfKnowledge(levelOfKnowledge);
       }
   }
   
   public void setTeachingBudget(double teachingBudget) {
       if (teachingBudget >= HIGH_Level_Budget) {
           super.setTeachingBudget(teachingBudget);
       }
   
   }
 
       
   }
