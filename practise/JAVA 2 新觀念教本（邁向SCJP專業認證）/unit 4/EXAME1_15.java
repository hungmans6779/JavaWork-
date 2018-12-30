class EXAME1_15
{
 public static void main(String argv[])
 {
  mark1:for(int i=5;i>0;i--)
  mark2:
         for(int j=0;j<5;j++)
         {
          if(j%2==1)
           continue mark1;
          System.out.print("*");
         }
 }
}