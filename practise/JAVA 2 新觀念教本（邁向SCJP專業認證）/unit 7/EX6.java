class EX6
{
 public static void main(String argv[])
 {
  int a=2;
  byte b=5;
  double c=6.0;
  EX6 obj=new EX6();
  obj.listStar(a);
  obj.listStar(b);
  obj.listStar((int)c);
 }
 void listStar(int n)
 {
  while(n-->0)
  {
   System.out.print("*");	
 	}
 	System.out.println();
 }	
}