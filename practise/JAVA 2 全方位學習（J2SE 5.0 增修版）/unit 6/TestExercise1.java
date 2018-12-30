 public class TestExercise1
 {
  public static void main(String argv[])
  {
   for (int i=0;i<3;i++)
   {
    for (int j=0;j<2;j++)
    {
     if (i==j)
      continue;
     System.out.println("i="+i+"j="+j); 
    }
   }
  }
 }