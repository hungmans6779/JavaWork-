public class ForEachTest3
{
 public static void main(String argv[])
 {
  String exams[][]={{"SCJP","SCMAD","SCWCD"},{"MCSE","MCSA"}};
  A:
  for(String s1[]:exams)
  {
   for(String s2:s1)
   {
    System.out.print(s2+",");
    continue A;
   }
   break;
  } 
 }
}