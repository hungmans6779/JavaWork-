public class EXAME136
{
 String title;
 int value;
 public EXAME136()
 {
  title+="World";
 }
 public EXAME136(int value)
 {
  this.value=value;
  title="Hello";
  EXAME136();
 }
 public static void main(String argv[])
 {
 	EXAME136 exame136=new EXAME136(23);
 	System.out.println("exame136 = "+exame136.title);
 }	
}