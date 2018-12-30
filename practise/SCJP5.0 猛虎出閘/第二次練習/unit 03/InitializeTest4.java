public class InitializeTest4
{
 static String id;
 int birthday;
 static String name;
 
 {
  id="A123456789";
  birthday=20050202;
  name="pcschool";
 }
 public void getInfo()
 {
  System.out.println("id="+id);
  System.out.println("birthday="+birthday);
  System.out.println("name="+name);	
 }	
 
 public static void main(String argv[])
 {
  new InitializeTest4().getInfo();
 }
}