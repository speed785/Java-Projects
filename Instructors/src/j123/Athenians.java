package j123;
//Made by James Dumitru
import java.util.List;
public class Athenians extends Instructors {
   public Athenians() {
       super();
   }
   public Athenians(String instructorName, List<String> teachingMaterials) {
       super(instructorName, teachingMaterials);
   }
   @Override
   public void setLevelOfKnowledge(int levelOfKnowledge) {
       if (levelOfKnowledge >= MEDIUM_Level_Knowledge && levelOfKnowledge < HIGH_Level_Knowledge) {
           super.setLevelOfKnowledge(levelOfKnowledge);
       }
   }
   
   public void setTeachingBudget(double teachingBudget) {
       if (teachingBudget >= MEDIUM_Level_Budget && teachingBudget < HIGH_Level_Budget) {
           super.setTeachingBudget(teachingBudget);
       }
   }
}