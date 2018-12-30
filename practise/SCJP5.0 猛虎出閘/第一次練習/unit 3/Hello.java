public class Hello
{
 String title;
 int value;
 public Hello()
 {
 	this(5);
  title+="world";
 }
 public Hello(int value)
 {
  this.value=value;
  title="Hello";
  //Hello();
 }
 public static void main(String argv[])
 {
 	Hello c=new Hello();
 	System.out.println(c.title);
 	
 }	
}
