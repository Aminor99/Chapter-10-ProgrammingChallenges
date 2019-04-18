//Name: Asia Minor
//Date: 4-18-19
//Purpose: Quiz

public class ExaggeratingKid extends SchoolKid {
   private String name, teachersName, greeting;
   int age;
   public ExaggeratingKid(String n, int a, String tN, String g){
      super(n, a, tN, g);
   }
   @Override
   public int getAge(){
      return age + 2;
   }
   @Override
   public String getGreeting(){
      return super.getGreeting() + ", I am the best!";
   }
}