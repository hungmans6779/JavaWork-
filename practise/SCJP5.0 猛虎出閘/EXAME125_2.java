enum Test
{
 ANIMAL(4),DOG(4),FISH(0),PEOPLE(2);
 private int legs;
 private Test(int legs)
 { this.legs=legs; }
 public String getLegs()
 {
  switch(this)
  {
   case ANIMAL: return "�ʪ���: "+legs+" ��}"; 
   case DOG: return "����: "+legs+" ��}"; 
   case FISH: return "����: "+legs+" ��}"; 
   case PEOPLE: return "�H����: "+legs+" ��}"; 
   default: return "�S���}"; //�o�@�q�@�w�n�[�J
  }
 }
}


public class EXAME125_2
{
 public static void main(String argv[])
 {
  System.out.println(Test.ANIMAL.getLegs());
  System.out.println(Test.DOG.getLegs());
  System.out.println(Test.FISH.getLegs());
  System.out.println(Test.PEOPLE.getLegs());
 }
}