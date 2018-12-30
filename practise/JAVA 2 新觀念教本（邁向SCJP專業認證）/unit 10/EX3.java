public class EX3
{
 public static void main(String argv[])
 {
  byte by=1;
  short sh=1;
  Object [] arr=new Object[8];
  arr[0]=true;
  arr[1]=by;
  arr[2]='A';
  arr[3]=sh;
  arr[4]=1;
  arr[5]=1L;
  arr[6]=0.1F;
  arr[7]=0.1;
  for(Object o:arr)
  {
   System.out.println(o.getClass());
  } 
 }
}