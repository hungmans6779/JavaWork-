public class AccumulateEntry
{
 public static void main(String argv[])
 {
  CountValue value=new CountValue();
  System.out.println("accumlateValue="+value.countValue());
 }
}
class CountValue
{
 public int countValue()
 {
 	int sum=0;
 	int i;
 	for (i=0;i<=10;i++)
  	sum+=i;
 	return sum;
 }	
}
