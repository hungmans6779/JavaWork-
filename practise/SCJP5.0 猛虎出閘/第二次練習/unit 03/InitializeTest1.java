public class InitializeTest1
{
 String id;
 int birthday;
 String name;
 InitializeTest1()
 { }
 InitializeTest1(int kind)
 { }
 
 {
  id="A123456789";
  birthday=20050101;
  name="pcschool";
 }
 public static void main(String argv[])
 {
  new InitializeTest1().getInfo();
  System.out.println("======================");
  new InitializeTest1(100).getInfo();
 }
 public void getInfo()
 {
  System.out.println("id="+id);
  System.out.println("birthday="+birthday);
  System.out.println("name="+name);	
 }	
 
}