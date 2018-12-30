public class Zoov4
{
 public static void main(String argv[])
 {
  Animalv4 animal1=new Animalv4();
  Animalv4 animal2=new Animalv4();
  Animalv4 animal3=new Animalv4(10);
   
  animal1.setLegs(3);
  animal2.setLegs(2);
  
  System.out.println("animal1 has "+animal1.getLegs()+" legs");
  System.out.println("animal1 has "+animal2.getLegs()+" legs");
  System.out.println("animal1 has "+animal3.getLegs()+" legs");
 }
}