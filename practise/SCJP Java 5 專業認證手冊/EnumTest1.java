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
   case DOG: return "����: "+legs+" ��}";
   case CAT: return "�ߦ�: "+legs+" ��}";
   case PEOPLE:return "�H����: "+legs+" ��}";
   default: return "���b���d��";
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