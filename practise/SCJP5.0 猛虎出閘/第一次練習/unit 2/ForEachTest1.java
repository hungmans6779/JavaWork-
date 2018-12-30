class ForEachTest1
{
 public static void main(String argv[])
 {
  String s[]={"SCJP","SCWCD","SCMAD"};
  for(int i=0;i<s.length;i++)
  {
   System.out.print(s[i]+"\t");
  }
  System.out.println();
  for(String s1:s)
  {
   System.out.print(s1+"\t");
  }
 }
}