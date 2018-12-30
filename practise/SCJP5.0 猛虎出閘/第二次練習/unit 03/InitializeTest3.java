public class InitializeTest3
{
 static String id;
 int birthday;
 static String name;
 
 static
 {
  id="A123456789";
  //birthday=20050202;
  name="pcschool";
 }
 InitializeTest3()
 { 	}
 public void getInfo()
 {
  System.out.println("id="+id);
  System.out.println("birthday="+birthday);
  System.out.println("name="+name);	
 }	
 
 public static void main(String argv[])
 {
  new InitializeTest3().getInfo();
 }
}