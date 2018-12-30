public class Animalv4
{
 private int legs;
 public Animalv4()
 {
  setLegs(4);
 }
 public Animalv4(int l)
 {
  setLegs(l);
 }
 public void eat()
 {
  System.out.println("Eating......");
 }
 public void move()
 {
  System.out.println("Moving.....");
 }
 public void setLegs(int n)
 {
  if (n==0 || n==2 || n==4)
  { 
   legs=n;
  }
  else
  {
    System.out.println("Wrong number of legs");
  } 
 }
 public int getLegs()
 {
  return legs;
 }
}