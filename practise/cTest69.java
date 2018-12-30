public class cTest69
{
 public static void main(String argv[])
 {
 	String str="國文";
 	if(str.matches("[^0-9^a-z^A-Z]*"))
 	{
 	 System.out.println("是中文姓名");	
 	}	
 	else
 	{
 		System.out.println("不是中文姓名");
  }		
 }		
}