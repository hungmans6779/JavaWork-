class EX10_1
{
 public static void main(String argv[])
 {
  int a1[]={16,17,18};
  int a2[]=new int[a1.length];
  int a3[]={16,17,18};
  a2=a1;
  System.out.println("a1 的參照為: "+a1);
  System.out.println("a2 的參照為: "+a2);
  System.out.println("a3 的參照為: "+a3);
  a2[1]=32;
  System.out.println("a1[0]="+a1[0]+"\ta1[1]="+a1[1]+"\ta1[2]="+a1[2]);
  System.out.println("a2[0]="+a2[0]+"\ta2[1]="+a2[1]+"\ta2[2]="+a2[2]);
  System.out.println("a3[0]="+a3[0]+"\ta3[1]="+a3[1]+"\ta3[2]="+a3[2]);
 }
}