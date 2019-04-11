//Name: Asia Minor
//Date: 4-11-19
//Purpose: Design an Essay class that extends the GradedActivity class. The essay class should determine
//the grade a studensts recieves for an essay. The students essay score can be up to 100 and is determined in 
//the following manner grammar, 30 p, spelling 20 p, corect length 20 p, conetnt 30 p

public class Essay extends GradedActivity{

   private int grammarPts, spellingPts, correctLengthPts, contentPts; //points that the person got for the sections of the essay
   
   public Essay(int gP, int sP, int cLP, int cP){ //subtracts the total points for eachs ection with the given points from the constructor
      double gPoints = 100/30, sPoints = 100/20, clPoints = 100/20, cPoints = 100/30;
            
      grammarPts = 30 - gP;
      spellingPts = 20 - sP;
      correctLengthPts = 20 - cLP;
      contentPts = 30 - cP; 
      
      double gScore = 100.0/(grammarPts * gP), sScore = 100.0/(spellingPts * sP), clScore = 100.0/(correctLengthPts * cLP);
      double cScore = 100.0/(contentPts * cP);
      
      double score; //holds the score that the user gets in the test
      score = (grammarPts + spellingPts + correctLengthPts + contentPts);
      
      setScore(score);
      
   }
}