public class AddEntry
{
 public static void main(String argv[])
 {
   AddSum addsum=new AddSum();
   System.out.println("a+b="+addsum.addSum(10,20));
 }
}

class AddSum
{
 public int addSum(int a,int b)
 {
  int sum=0;
  sum=a+b;
  return sum;
 }
} 