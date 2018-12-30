public class AssertionTest3
{
 enum sex {boy,girl}
 public static void main(String argv[])
 {
  switch(sex.boy)
  {
   case boy:
    System.out.println("您的性別是男生");
    break;
   case girl:
    System.out.println("您的性別是女生");
    break;
   default:
    assert false :"您的性別有誤";
    break;  
  
  }
 }
}