//Name: Asia Minor
//Date: 4-18-19
//Purpose: Quiz

public class SchoolKid {
   private String name, teachersName, greeting;
   int age;
   public SchoolKid(String n, int a, String tN, String g){
      name = n;
      teachersName = tN;
      greeting = g;
      age = a;
   }
   public String getName(){
      return name;
   }
   public void setName(String n){
      name = n;
   }
   public String getTeacherName(){
      return teachersName;
   }
   public void setTeacherName(String tN){
      teachersName = tN;
   }
   public String getGreeting(){
      return greeting;
   }
   public void setGreeting(String g){
      greeting = g;
   }
   public int getAge(){
      return age;
   }
   public void setAge(int a){
      age = a;
   }
   
   
}