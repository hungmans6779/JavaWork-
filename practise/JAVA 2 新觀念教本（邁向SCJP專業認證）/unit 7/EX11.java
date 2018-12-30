class EX11
{
 public static void main(String argv[])
 {
 	methodName(1);
 }	
 static void methodName(int a)
 {
  int b=2;
  System.out.println("a:"+a);
  System.out.println("b:"+b);
  for(int c=0;c<10;c++)
  {
   if(c==3)
    System.out.println("c:"+c);	
  }
  int d=4;
  if(d==4)
  {
   System.out.println("d:"+d);
   int e=5;
   System.out.println("e:"+e);	
  }
  {
   int f=6;
   System.out.println("f:"+f);	
  }				
 	
 }	
}	