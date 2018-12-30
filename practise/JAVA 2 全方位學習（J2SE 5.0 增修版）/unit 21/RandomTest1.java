public class RandomTest1
{
 public static void main(String argv[])
 {
  double data;
  double data1;
  int i;
  for(int j=0;j<999999;j++)
  {
   data=Math.random();
   //data1=data*1000;
   //i=(int)data1;
   i=(int)(data*100);
   System.out.println(i);
  
  }
 
 }
}