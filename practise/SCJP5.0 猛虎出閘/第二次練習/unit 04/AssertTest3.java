public class AssertTest3
{
 public static void main(String argv[])
 {
  switch(3)
  {
   case 1: System.out.println("男生"); break;
   case 2: System.out.println("女生"); break;
   default: assert false:"性別有誤"; break;
  }	
 }
}