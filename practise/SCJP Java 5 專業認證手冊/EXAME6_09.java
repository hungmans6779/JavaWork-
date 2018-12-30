public class EXAME6_09
{
 public static void main(String argv[])
 {
  System.out.format("%b\n",123);
  //System.out.format("%c","x"); //出現IllegalFormatCoversionException的例外
  System.out.format("%c\n",'x');
  System.out.format("%d\n",123);
  //System.out.format("%f\n",123);//出現IllegalFormatCoversionException的例外
  //System.out.format("%d\n",123.45);//出現IllegalFormatCoversionException的例外
  System.out.format("%f\n",123.45);
  System.out.format("%s",new Long("123"));
 }
}