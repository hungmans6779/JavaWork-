public class SwitchEnumTest2
{
 enum Color{Red,Blue,Green};
 public static void main(String argv[])
 {
  switch(Color.Blue)
  {
   case Red: System.out.println("Red"); break;
   case Green: System.out.println("Green");break;
   case Blue:System.out.println("Blue"); break;
   default: assert false;
  
  }
 }
}