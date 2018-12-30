import static java.lang.System.out;
class MultidimensionalArrayTest1
{
 public static void main(String argv[])
 {
  int i1[][]=new int[2][2];
  i1[0][0]=1;
  i1[0][1]=2;
  i1[1][0]=3;
  i1[1][1]=4;
  for(int a1[]:i1)
   for(int a2:a1)
    out.print(a2+"\t");
    
  out.println();  
  int i2[][]=new int[2][];
  i2[0]=new int[1];
  i2[1]=new int[2];
  i2[0][0]=1;
  i2[1][0]=2;
  i2[1][1]=3;
  for(int a1[]:i2)
   for(int a2:a1)
    out.print(a2+"\t");  
    
  out.println();
  int i3[][]=new int[2][];
  i3[0]=new int[]{1,2,3,4};
  i3[1]=new int[]{5,6,7};
  for(int a1[]:i3)
   for(int a2:a1)
    out.print(a2+"\t");
        
 }
}