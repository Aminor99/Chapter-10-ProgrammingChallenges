//Name: Asia Minor
//Date: 4-23-19
//Purpose: Programming Challenge 5

import java.util.Scanner;

public class CourseGrades{
      
   private static int activityGrade, g, s, cLP, cP, numMissedActivity, numMissedFinal;
      
   private GradedActivity lab;
   private Essay essay;
   private PassFailExam activity;
   private FinalExam finalE;
      
   private static GradedActivity grades[] = new GradedActivity [4];
      
   public CourseGrades(GradedActivity g[]){
      grades = g;
   }

   public static void main(String[] args){
   
      askGrades();
      
      GradedActivity lab = new GradedActivity();
      Essay essay = new Essay(g, s, cLP, cP);
      PassFailExam activity = new PassFailExam(10, numMissedActivity, 70.0); 
      FinalExam finalE = new FinalExam(50, numMissedFinal);
      
      lab.setScore(activityGrade); 
      
      grades[0] = lab;
      grades[1] = essay;
      grades[2] = activity;
      grades[3] = finalE;
            
      CourseGrades cg = new CourseGrades(grades); 
      
      System.out.println(cg);
      
   }
   public static void askGrades(){
   
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("What did the student score on the lab?");
      activityGrade = keyboard.nextInt();
      
      System.out.println("How many points out of 30 did the student score on the grammar section?");
      g = keyboard.nextInt();
      System.out.println("How many points out of 20 did the student score on the spelling of the essay?");
      s = keyboard.nextInt();
      System.out.println("How many points out of 20 did the student score on the length of the essay?");
      cLP = keyboard.nextInt();
      System.out.println("How many points out of 30 did the student get on the content of the essay?");
      cP = keyboard.nextInt();
      
      System.out.println("How many questions did the student miss on the activity?");
      numMissedActivity = keyboard.nextInt();
      
      System.out.println("How many questions did the student miss on the final exam?");
      numMissedFinal = keyboard.nextInt();
   }
   public void setLab (GradedActivity gA){
      grades[0] = gA;
   }
   public void setPassFailExam (PassFailExam pFE){
      grades[1] = pFE;
   }
   public void setEssay (Essay e){
      grades[2] = e;
   }
   public void setFinalExam (FinalExam fE){
      grades[3] = fE;
   }
  
   public String toString(){
      String s = " Lab Score: " + grades[0].getScore() + "\n Exam Score: " + grades[2].getGrade() + "\n Essay Score: " 
      + grades[1].getScore() + "\n FinalExam:" + grades[3].getScore();
      return s;
   }
}