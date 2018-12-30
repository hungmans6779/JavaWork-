class SuperException extends Exception
{
 public SuperException(String mID)
 {
 	//System.out.println("會員編號: "+mID+" 不是合法的使用者！");
 	super("會員編號: "+mID+" 不是合法的使用者！");
 }		
 static void showError()
 {
 	System.out.println("請您跟系統管理員連絡....");
 	System.out.println("電話09175038xx");
 }	
}	
public class ExceptionTest9 
{
 public static void main(String argv[])
 {
 	boolean var=true;
 	try
 	{
 	 checkID("123456789");	
 	}	
 	catch(SuperException se)
 	{	
 	 System.out.println("資料錯誤 "+se.getMessage());
 	 se.showError();	
 	 var=false;
 	}	
 	if(var==true)
 	{
 	 System.out.println("會員資料驗證成功.............");	
 	}
 	else
 	{
 	 System.out.println("會員資料驗證失敗.............");	
 	}	
 }
 static void checkID(String mID) throws SuperException
 {
 	if(mID.length()!=5)
 	{
 	 throw new SuperException(mID);	
 	}	
 
 }			
}	