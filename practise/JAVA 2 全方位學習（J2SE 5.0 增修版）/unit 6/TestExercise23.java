public class TestExercise23
{
 public static void main(String argv[])
 {
  int a=Integer.parseInt(argv[0]);
  int b=Integer.parseInt(argv[1]);
  int sum=0;
  if (a<b)
   for (int i=a;i<=b;i++)
    sum+=i;
  else 
   for (int j=a;j>=b;j--)
    sum+=j;
  System.out.println("Input a value="+a);
  System.out.println("Input b value="+b);  
  System.out.println("a to b Total Value="+sum);
 }
}