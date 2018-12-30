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
   case ANIMAL: return "動物有: "+legs+" 支腳"; 
   case DOG: return "狗有: "+legs+" 支腳"; 
   case FISH: return "魚有: "+legs+" 支腳"; 
   case PEOPLE: return "人類有: "+legs+" 支腳"; 
   default: return "沒有腳"; //這一段一定要加入
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