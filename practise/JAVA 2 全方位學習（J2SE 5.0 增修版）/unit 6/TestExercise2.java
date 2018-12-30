public class TestExercise2
{
 public static void main(String argv[])
 {
  Loop1:
  for (int i=0;i<3;i++)
  {
   for (int j=0;j<2;j++)
   {
    if (i==j)
    {
     continue Loop1;
    }
    System.out.println("i="+i+"j="+j);
   }
  } 
 }
}