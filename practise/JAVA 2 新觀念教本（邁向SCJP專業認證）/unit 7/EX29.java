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
   	//System.out.println(i); //�]���O��k�������O�A�ҥH�u��Ū��final�w�q���ݩ�
    System.out.println(j);
   }
  }
 
  Local loc=new Local();
  loc.getOuterVar();
  System.out.println(loc);
 
 
 }
}