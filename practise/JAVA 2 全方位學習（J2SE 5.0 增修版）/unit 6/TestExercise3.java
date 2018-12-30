public class TestExercise3
{
 public static void main(String argv[])
 {
  int j=1;
 Loop1:
  do
  {
   System.out.println(j++);
   if (j==6) 
   {
    System.out.println("j="+j);
    continue Loop1;
   }
  } while (j<20);
  
 
  
  //int i=5;
  //int j=1;
  //for (int k=1;j+k!=10;j++,k++)
  // System.out.println("j="+j+"k="+k);
   
  
  //while (5)
  //{
  //  i++;
  // System.out.println(i);
  //}
 }
}