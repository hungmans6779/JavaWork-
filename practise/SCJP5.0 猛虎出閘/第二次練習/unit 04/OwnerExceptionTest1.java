class MemberIDException extends Exception
{
 MemberIDException(String mid)
 {
  super("會員編號"+mid+"驗證失敗");	
 }	
 public void contactWith()
 {
 	System.out.println("請連絡服務人員+(06)2831xxx");
 }	
}

public class OwnerExceptionTest1
{
 public static void main(String argv[])
 {	
  boolean verify=true;
  try
  {
  	checkMember("A12121");
  }
  catch(MemberIDException me)
  {
  	System.out.println("錯誤訊息:"+me.getMessage());
  	me.contactWith();
  	verify=false;
  }		
  if(verify)
   System.out.println("驗證成功...");
  else
   System.out.println("驗證失敗...");
  } 
  public static void checkMember(String id) throws MemberIDException
  {
   if(id.length()!=5)
   {
   	throw new MemberIDException(id);
   }		
  }	
 
}