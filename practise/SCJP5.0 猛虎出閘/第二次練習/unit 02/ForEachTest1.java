public class ForEachTest1
{
 public static void main(String argv[])
 {
  String []exam={"SCJP","SCMAD","SCWCD"};
  for(int i=0;i<exam.length;i++)
   System.out.print(exam[i]+",");
  System.out.println(); 
  
  for(String s:exam)
   System.out.print(s+",");
   
 }
}