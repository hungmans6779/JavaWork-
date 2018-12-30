public class Accumulate1Entry
{
 public static void main(String argv[])
 {
  CountValue1 value=new CountValue1(10);
  System.out.println("accumlateValue="+value.countValue());
 }
}
class CountValue1
{
 int dataValue;
 public CountValue1(int dataValue)
 {
  this.dataValue=dataValue;
 }
 public int countValue()
 {
 	int sum=0;
 	int i;
 	for (i=0;i<=dataValue;i++)
  	sum+=i;
 	return sum;
 }	
}
