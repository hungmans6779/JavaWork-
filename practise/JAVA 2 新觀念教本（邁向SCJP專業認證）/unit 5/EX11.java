class EX11
{
 public static void main(String argv[])
 {
  int a1[]={10,20,30,40,50};
  int a2[]=new int[a1.length];
  int a3[]=new int[a1.length];
  System.arraycopy(a1,0,a2,0,a1.length);
  System.arraycopy(a1,2,a3,0,3);
  a2[1]=-1;
  for(int i=0;i<a1.length;i++)
  {
   System.out.print("a1["+i+"]="+a1[i]+"\t");	
   System.out.print("a2["+i+"]="+a2[i]+"\t");
   System.out.print("a3["+i+"]="+a3[i]+"\t");
   System.out.println();
  }	
  
 }
}