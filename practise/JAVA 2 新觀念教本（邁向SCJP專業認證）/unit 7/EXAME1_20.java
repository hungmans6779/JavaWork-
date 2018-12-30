class EXAME1_20
{
 int i=1;
 class C2
 {
  int i=2;
  class C3
  {
   int i=3;
   C3()
   {
    System.out.print(this.i);
    System.out.print(EXAME1_20.this.i);
    System.out.print(C2.this.i);
   }
  }
 }
 public static void main(String argv[])
 {
  new EXAME1_20().new C2().new C3();
 }
}