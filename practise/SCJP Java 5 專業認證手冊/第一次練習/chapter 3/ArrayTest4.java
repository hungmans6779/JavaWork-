class Food
{
 void takeArray(int [] k)
 {
  for(int i:k)
  {
   System.out.print(i+"\t");
  }
 }
}

public class ArrayTest4
{
 public static void main(String argv[])
 {
  Food f=new Food();
  int a[]={1,2,3,4,5,6};
  f.takeArray(a);
 }
}