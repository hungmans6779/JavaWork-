class EXAME1_14
{
 String os="外部類別的物件成員";
 class Inner
 {
  String is="內部類別的物件成員";
  public void method()
  {
   System.out.println(os);
   System.out.println(is);
  }
 }
 public static void main(String argv[])
 {
  EXAME1_14.Inner in=new EXAME1_14().new Inner();
  in.method();
 }
}