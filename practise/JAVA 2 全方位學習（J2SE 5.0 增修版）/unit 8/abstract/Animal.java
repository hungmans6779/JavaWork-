abstract public class Animal
{
 private int legs;
 private String kind;
 private static int count;
 
 public Animal()
 {
  this(4);
  count++;
 }
 public Animal(int l)
 {
  setLegs(l);
  count++;
 }
 public void eat()
 {
  System.out.println("Eating.....");
 } 
 abstract public void move();
// { 
//  System.out.println("Moving......");
// }
 public void setLegs(int l)
 {
  if (l==0 || l==2 || l==4)
  {
   legs=l;
  }
  else
  {
   System.out.println("Wrong legs.......");
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