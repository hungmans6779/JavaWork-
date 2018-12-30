class EX10_1
{
 public static void main(String args[])
 {
  int i = 1;
  int j = 0;
  for(; i <= 9; i++)
   j += i * i;
   
   System.out.println((new StringBuilder()).append("sum = ").append(j).toString());
 }
}