public class InitializeTest2
{
 String id;
 int birthday;
 String name;
 InitializeTest2()
 {
  id="B987654321";
 }
 InitializeTest2(int kind)
 { 
  id="C424562045";	
 }
 
 {
  id="A123456789";
  birthday=20050101;
  name="pcschool";
 }
 public static void main(String argv[])
 {
  new InitializeTest2().getInfo();
  System.out.println("======================");
  new InitializeTest2(100).getInfo();
 }
 public void getInfo()
 {
  System.out.println("id="+id);
  System.out.println("birthday="+birthday);
  System.out.println("name="+name);	
 }	
 
}