package j123;
//Made by James Dumitru
import java.util.ArrayList;
import java.util.List;
public class TestClass {
   public static void main(String args[]) {
	   
	   //Instructors
       List<String> teachingMaterials = new ArrayList<>();
       teachingMaterials.add(" Intro To Calculus");
       teachingMaterials.add("& JAVA Programming");
       //teachers name = Dean & class location = Calculations class
       Instructors instruct = new Instructors(" Dean", teachingMaterials);
       instruct.setLevelOfKnowledge(1);
       //old classroom
       instruct.setLocationOfClass(" Calculations class");
       
   		if (instruct.getLevelOfKnowledge() == 3);
   		instruct.setTeachingBudget(5000);
   		
   		//
   		//tried but just need these 2 for spartans and Athenians
   		if (instruct.getLevelOfKnowledge() == 2);
   		{instruct.setTeachingBudget(1000);
		
   		if (instruct.getLevelOfKnowledge() == 1);
      	instruct.setTeachingBudget(900);
   		}
   		// if I had more time I could do it, |come back here for future|
       
       //Spartans
       teachingMaterials = new ArrayList<>();
       teachingMaterials.add(" Electrical Mapping");
       teachingMaterials.add("& Structure Design");
       //teachers name = leon & class location = Operations class
       Spartans spartan = new Spartans(" Leon", teachingMaterials);
       spartan.setLevelOfKnowledge(3);
       //newer classroom ----------- Got the class to finally come and say Operations Class! 
       //No longer says null! :)
       spartan.setLocationOfClass(" Operations class");
       
      
       //Athenians
       teachingMaterials = new ArrayList<>();
       teachingMaterials.add(" Architecture");
       //teachers name = Deonysis & class location = Blueprint class
       Athenians athenian = new Athenians(" Deonysis", teachingMaterials);
       athenian.setLevelOfKnowledge(2);
       //newer classroom
       athenian.setLocationOfClass(" Blueprint class");
       System.out.println(instruct.toString());
       System.out.println(" Spartan => " + spartan.toString());
       System.out.println(" Athenian => " + athenian.toString()); 
      
   }
   }

