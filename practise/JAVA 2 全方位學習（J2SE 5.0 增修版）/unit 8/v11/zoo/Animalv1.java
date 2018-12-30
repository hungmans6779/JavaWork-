package zoo;
public class Animalv1
{
 private static int legs;
 private String kind;
 private static int count;
 public Animalv1()
 {
  //this(4);
  setLegs(4);
  count++; 
 }
 public Animalv1(int l)
 {
  setLegs(l);
  count++;
 }
 public void eat()
 {
  System.out.println("Eating.....");
 }
 public void move()
 {
  System.out.println("Moving.....");
 }
 public void setLegs(int l)
 {
  if (l==0 || l==2 || l==4)
  {
   legs=l;
  }
  else
  {
     System.out.println("");
  }
 } 
 public int getLegs()
 {
  return legs;
 }
 public void setKind(String str)
 {
  kind=str;
 }
 public String getKind()
 {
  return kind;
 }
 public static int getCount()
 {
  return count;
 }
}