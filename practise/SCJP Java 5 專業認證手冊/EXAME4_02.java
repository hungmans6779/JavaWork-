public class EXAME4_02
{
 public static void main(String argv[])
 {
  Short s=15;
  Boolean b;
  b=(s instanceof Short); //編譯及執行成功
  //b=(s instanceof Number);//編譯及執行成功
  //b=(s instanceof String); //編譯失敗
  System.out.println("b = "+b);
 }
}