/**
   Asia Minor
   3-11-19
   Programming Challenge 10-2
   This class demonstrates the shift supervisor class
*/
public class ShiftSupervisorDemo{
   //the main method
   public static void main(String [] args){
      ShiftSupervisor supervisor1 = new ShiftSupervisor("Aaron Sharpe","287-I", 1988, 30982.87, 876.08);
      ShiftSupervisor supervisor2 = new ShiftSupervisor("Beatrix Bex", "888-B", 2010, 51432.99, 911.21);
      displayWage(supervisor1);
      displayWage(supervisor2);
   }
   /**
     the displayWage method takes a supervisor object and displays the wage
     @param ss, the supervisor 
   */   
   public static void displayWage(ShiftSupervisor ss){
      System.out.println(ss.getName() + " makes " + ss.getAnnualSalary() + " dollars a year!");
   }
}