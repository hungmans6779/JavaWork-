enum Animal
{
 DOG(4),CAT(4),PEOPLE(2);
 int legs;
 private Animal(int legs)
 {
  this.legs=legs;
 }
 public String show()
 {
  switch(this)
  {
   case DOG: return "狗有: "+legs+" 支腳";
   case CAT: return "貓有: "+legs+" 支腳";
   case PEOPLE:return "人類有: "+legs+" 支腳";
   default: return "不在此範圍內";
  }
 }
 
}
public class EnumTest1
{
 public static void main(String argv[])
 {
  System.out.println(Animal.DOG.show());
  System.out.println(Animal.CAT.show());
  System.out.println(Animal.PEOPLE.show());
 }
}