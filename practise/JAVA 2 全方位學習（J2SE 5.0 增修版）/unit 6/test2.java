public class test2
{
 public static void main(String argv[])
 {
  Integer.parseInt(argv[0]);
  Integer.parseInt(argv[1]);
  Integer.parseInt(argv[2]);
  Integer.parseInt(argv[3]);
  Integer.parseInt(argv[4]);
  int max=Integer.parseInt(argv[0]);
  for (int j=0;j<=4;j++)
  {System.out.print(argv[j]+",");}
  for (int i=0;i<=4;i++)
  { 
   if (max< Integer.parseInt(argv[i]))
   {
    max=Integer.parseInt(argv[i]);
   }
  }
  System.out.println("max value="+max);
 }
}