enum EXAME125
{
 GOLDFISH(7),ANGELFISH(5),GUPPY(2);
 private int price;
 private EXAME125(int price)
 {
  this.price=price;
 }
 public String getDescription()
 {
  switch(this)
  {
   case GOLDFISH: return "Gold fish priced at "+price;
   case ANGELFISH: return "Angel fish priced at "+price;
   case GUPPY: return "Fancy fish priced at "+price;
   default: return  "No such fish";
  }
 }
}

public class EXAME125_1
{
 public static void main(String argv[])
 {
  System.out.println(EXAME125.GOLDFISH.getDescription());
  System.out.println(EXAME125.ANGELFISH.getDescription());
  System.out.println(EXAME125.GUPPY.getDescription());
 }
}