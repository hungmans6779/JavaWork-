public class ArrayTest4_1
{
 public static void main(String argv[])
 {
  int a[]=new int[3];
  byte b=2;
  char c='A';
  short s=34;
  a[0]=b;
  a[1]=c;
  a[2]=s;
  for(int num:a)
  {
   System.out.print(num+"\t");
  }
 }
}