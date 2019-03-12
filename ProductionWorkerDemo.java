/**
   Asia Minor
   3-11-19
   Programmin Challenge 10-1
   This program is a demonstration of the ProductionWOrker object
*/
public class ProductionWorkerDemo{
   //the main method
   public static void main(String [] args){
      ProductionWorker pw1 = new ProductionWorker("Jeff Kaplan", "027-B", 2015, 1, 30.75);
      ProductionWorker pw2 = new ProductionWorker("Mariya T", "223-Y", 1980, 2, 17.22);
      Employee e = new ProductionWorker("Baby Queen", "123-A", 1973, 2, 10.10);  //testing out polymorphism.
    
      System.out.println(pw1.getName());
      
      whatShift(pw1);
      whatShift(pw2);
      giveRaise(pw1);
      
      e.setID("429-D");
      System.out.println(e.getID());
   }
   /**
      The whatShift method determines if the worker is working the day or night shift by looking at the shift field
      @param w, the production worker
   */
   public static void whatShift(ProductionWorker w){
      if(w.getShift()==1){
         System.out.println(w.getName() + " works the day shift.");
      } else {
         System.out.print(w.getName() + " works the night shift.");
      }
   }
   /**
      The giveRaise method adds 3$ to the worker and sets that new pay as the workers pay
      @param w, the worker
   */
   public static void giveRaise(ProductionWorker w){
      final double raise = 3.00;
      double newPay = w.getHourlyPay() + raise;
      System.out.println(w.getName() + " gets a raise of " + raise + ". Their new pay is " + newPay);
      w.setHourlyPay(newPay);
   }
}