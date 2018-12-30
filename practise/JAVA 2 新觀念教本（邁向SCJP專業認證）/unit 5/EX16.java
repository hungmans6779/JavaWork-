class EX16
{
 public static void main(String argv[])
 {
  int a[][]={{11,12,13},{21,22},{31,32,33,34}};
  for(int i[]:a)
  {
   for(int j:i)
   {
    System.out.print(j+"\t");
   }
   System.out.println();
  }
 }
}