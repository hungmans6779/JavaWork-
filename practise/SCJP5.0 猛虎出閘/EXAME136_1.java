public class EXAME136_1
{
 String title;
 int value;
 public EXAME136_1()
 {
  title="World";
 }
 public EXAME136_1(int value)
 {
 	this();
  this.value=value;
  title+="Hello";
 }
 public static void main(String argv[])
 {
 	EXAME136_1 exame136_1=new EXAME136_1(23);
 	System.out.println("exame136_1.title = "+exame136_1.title);
 }	
}