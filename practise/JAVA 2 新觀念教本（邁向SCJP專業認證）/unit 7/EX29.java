public class EX29
{
 public static void main(String argv[])
 {
  int i=5;
  final int j=6;
  class Local
  {
   void getOuterVar()
   {
   	//System.out.println(i); //因為是方法內部類別，所以只能讀取final定義的屬性
    System.out.println(j);
   }
  }
 
  Local loc=new Local();
  loc.getOuterVar();
  System.out.println(loc);
 
 
 }
}