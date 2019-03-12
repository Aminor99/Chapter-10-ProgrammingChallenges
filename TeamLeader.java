/**
   Asia
   3-11-19
   Programming Challenge 10-3
   This class is for making a team leader object that extends from the employee object
*/
public class TeamLeader extends Employee{
   private double hourlyPay;
   final private double fixedMonthlyBonus;
   private int minimumHours, hoursAttended;
   /**
      the constructor method
      n, id, hD is from the employee class
      @param hP, the hourlypay of the team leader
      @param fB, the fixed monthly bonus of the team leader
      @param mH, the minimum hours of training the team leader needs 
      @param hA, the hours attended by the team leader
   */
   public TeamLeader(String n, String id, int hD, double hP, double fB, int mH, int hA){
      super(n, id, hD);
      hourlyPay = hP;
      fixedMonthlyBonus = fB;
      minimumHours = mH; //hours require
      hoursAttended = hA; //how many hours the team leaders have attended
   }
   /**
      the following methods are getters and setters for the fields
   */
   public double getHourlyPay(){
      return hourlyPay;
   }
   public double getFixedMonthlyBonus(){
      return fixedMonthlyBonus;
   }
   public int getMinimumHours(){
      return minimumHours;
   }
   public int getHoursAttended(){
      return hoursAttended;
   }
   public void setHourlyPay(double hP){
      hourlyPay = hP;
   }
   public void setMinimumHours(int mH){
      minimumHours = mH;
   } 
   public void setHoursAttended(int hA){
      hoursAttended = hA;
   }
}