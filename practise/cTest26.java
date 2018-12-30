class A
{
 int i=10;
}

public class cTest26
{
 public static void main(String argv[])
 {
  A ar1[]=new A[3];
  ar1[0]=new A();
  ar1[0].i=10;
  ar1[1]=new A();
  ar1[1].i=20;
  ar1[2]=new A();
  ar1[2].i=30;
  A ar2[]=new A[5];
  ar2[0]=new A();
  ar2[1]=new A();
  ar2[2]=new A();
  System.out.println("複製前");
  System.out.println(ar2[0].i);
  System.out.println(ar2[1].i);
  System.out.println(ar2[2].i);
  
  System.out.println("複製後");
  System.arraycopy(ar1,0,ar2,0,3);
  System.out.println(ar2[0].i);
  System.out.println(ar2[1].i);
  System.out.println(ar2[2].i);
  System.out.println("===========");
  ar1[0].i=30;
  ar2[0].i=20;
  System.out.print(ar1+",");
  System.out.println(ar2);
  System.out.println(ar1[0]);
  System.out.println(ar2[0]);
 
 }
}