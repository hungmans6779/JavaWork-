public class AssertionTest3
{
 enum sex {boy,girl}
 public static void main(String argv[])
 {
  switch(sex.boy)
  {
   case boy:
    System.out.println("�z���ʧO�O�k��");
    break;
   case girl:
    System.out.println("�z���ʧO�O�k��");
    break;
   default:
    assert false :"�z���ʧO���~";
    break;  
  
  }
 }
}