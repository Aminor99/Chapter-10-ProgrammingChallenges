/**
   Asia Minor
   3-11-19
   Programming Challenge 10-1
   The purpose of this class is to make a worker object
*/

public class Employee{
   private String name, idNumber;
   private int hireDate;
/**
   This is the constructor
   @param n, the name of the employee
   @param id, the id number of the employee
   @param hD, the date the employee was hired
*/
   public Employee(String n, String id, int hD){
      name = n;
      idNumber = id;
      hireDate = hD;
   }
   /** 
      The following methods are getters and setters for each of the fields
   */
   public String getName(){
      return name;
   }
   public String getID(){
      return idNumber;
   }
   public int getHireDate(){
      return hireDate;
   }
   public void setName(String n){
      name = n;
   }
   public void setID(String id){
      id = idNumber;
   }
   public void setHireDate(int hD){
      hireDate = hD;
   }
}