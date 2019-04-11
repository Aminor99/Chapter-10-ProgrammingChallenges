//Name: Asia Minor
//Date: 4-11-19
//Purpose: Design an Essay class that extends the GradedActivity class. The essay class should determine
//the grade a studensts recieves for an essay. The students essay score can be up to 100 and is determined in 
//the following manner grammar, 30 p, spelling 20 p, corect length 20 p, conetnt 30 p

import java.util.Scanner;

public class EssayDemo{
   
   public static void main(String [] args){
   
      Scanner kb = new Scanner(System.in);
      
      System.out.println("You will be asked to enter scores for a test. \nGrammar portion: How many points out of 30 of did this student miss?");
      int grammarScore = kb.nextInt();
      System.out.println("Spelling: How many points out of 20 did this student miss?");
      int spellingScore = kb.nextInt();
      System.out.println("Correct Length: How many points out of 20 did this student miss?");
      int correctLengthScore = kb.nextInt();
      System.out.println("Content: How many points out of 30 did this student miss?");
      int contentScore = kb.nextInt();
      
      Essay e = new Essay (grammarScore, spellingScore, correctLengthScore, contentScore);
      
      System.out.println("This student got a " + e.getGrade() + " on their essay!");
   
   }
}