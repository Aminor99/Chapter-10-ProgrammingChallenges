/**
   Asia Minor
   3-11-19
   Programming Challenge 10-3
   This class demonstrates the team leader class
*/
public class TeamLeaderDemo{
   public static void main (String [] args){
      TeamLeader tl = new TeamLeader("Taako T.", "808-B", 2016, 16.78, 4.99, 60, 7);      
      getRemainingHours(tl);
   }
   /**
      the getRemainingHours method takes the minimum hours required from the team leader and subtracts the hours attended by the team leader
      @param tl, the team leader
   */
   public static void getRemainingHours(TeamLeader tl){
      int remainingHours = tl.getMinimumHours() - tl.getHoursAttended(); 
      System.out.println(tl.getName() + " has taken a total of " + tl.getHoursAttended() + " out of " + tl.getMinimumHours() + " leaving " +
      (tl.getMinimumHours() - tl.getHoursAttended()) + " hours of training to attend.");
   }
}