public class ForEachTest2
{
 public static void main(String argv[])
 {
  String exams[][]={{"SCJP","SCMAD","SCWCD"},{"MCSE","MCSA"}};
  for(String s1[]:exams)
  {
   for(String s2:s1)
   {
    System.out.print(s2+",");
   }
   System.out.println();
  } 
 }
}