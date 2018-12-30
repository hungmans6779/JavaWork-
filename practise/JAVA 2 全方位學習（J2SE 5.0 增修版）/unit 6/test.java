public class test
{
 public static void main(String argv[])
 {
   int aa,bb=0;
   for (int i=0;i<10;i++)
   {
    for (int j=1;j<=7;j+=2)
    {
     //k=j+2;
     aa=i/j;
     bb=i%j;
     if (aa==1 && bb==0)
     { System.out.print(i+",");}
    } 
   } 
  //int j=10%3;
  //int k=10%5;
  //int l=10%7;
  //System.out.println("i="+i);
  //System.out.println("j="+j);
  //System.out.println("j="+k);
  //System.out.println("l="+l);
 }
}