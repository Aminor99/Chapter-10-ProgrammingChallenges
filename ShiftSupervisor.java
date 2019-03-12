/**
   Asia Minor
   3-11-19
   Programming Challenge 10-2
   This codes purpose is to make the SupervisorClass that extedns
*/
public class ShiftSupervisor extends Employee{
   private double annualSalary, productionBonus;
   /**
      This is the Constructor method
      n, id, and hD comes from the super class
      @param aS, how much the supervisor makes in a year
      @param pB, the yearly bonus that the supervisor earns
   */
   public ShiftSupervisor(String n, String id, int hD, double aS, double pB){
      super(n, id, hD);
      annualSalary = aS;
      productionBonus = pB;
   }
   /**
      The following methods are getters and setters for the fields of the object
   */
   public double getAnnualSalary(){
      return annualSalary;
   }
   public double getProductionBonus(){
      return productionBonus;
   }
   public void setAnnualSalary(double aS){
      annualSalary = aS;
   }
   public void setProductionBonus(double pB){
      productionBonus = pB;
   }
}