class EXAME1_14
{
 String os="�~�����O�����󦨭�";
 class Inner
 {
  String is="�������O�����󦨭�";
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