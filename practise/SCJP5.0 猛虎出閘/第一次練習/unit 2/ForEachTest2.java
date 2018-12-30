class ForEachTest2
{
 public static void main(String argv[])
 {
  String s[][]={{"SCJP","SCWCD","SCMAD"},{"MCSD","MCAD","MCDBA"}};
  A:
  for(String s1[]:s)
  {
   B:
   for(String s2:s1)
   {
   	System.out.print(s2+",");
   	continue A;
   }		
   break;
  }	
  System.out.println();
 }
}