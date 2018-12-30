public class test1
{
 public static void main(String argv[])
 {
  int a=Integer.parseInt(argv[0]);
  int b=Integer.parseInt(argv[1]);
  System.out.println("a="+a+","+"b="+b);
  System.out.println(argv[0]);
  if (a>b)
  {
   System.out.println("a>b");
  } 
  else
  { 
   if(a<b)
   {
    System.out.println("a<b"); 
   }
   else
    System.out.println("a=b"); 
  } 
 }
}