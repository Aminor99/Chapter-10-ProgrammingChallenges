/**
   Asia Minor
   3-11-19
   Programming Challenge 10-1
   This class is for making the ProductionWorker
*/   
public class ProductionWorker extends Employee{
   private int shift; //1 for day shift, 2 for night shift
   private double hourlyPay;
   /**
      This is the constructor method
      @param s, the shift the worker works
      @param hP, the hourly rate at which the worker is payed
   */
   public ProductionWorker(String n, String id, int hD, int s, double hP){
      super(n, id, hD);
      shift = s;
      hourlyPay = hP;
   }
   /**
      The following methods are getters and setters for for the fields
   */
   public int getShift(){
      return shift;
   }
   public double getHourlyPay(){
      return hourlyPay;
   }
   public void setShift(int s){
      shift = s;
   }
   public void setHourlyPay(double hP){
      hourlyPay = hP;
   }
}