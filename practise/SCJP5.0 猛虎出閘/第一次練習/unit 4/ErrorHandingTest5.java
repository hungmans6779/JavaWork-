class MemberIDExcetpion extends Exception
{
 public MemberIDExcetpion(String mID)
 {
   super("會員編號"+mID+"驗證失敗！");
 }
 public void contactWith()
 {
  System.out.println("請連絡服務人員:"+"Tel (xx) - (xxxx-xxxx)！");
 }
}
public class ErrorHandlingTest5
{
 public static void main(String argv[])
 {
  boolean verify=true;
  try
  {
   checkMemberID("1234567890");
  }
  catch(MemberIDExcetpion e)
  {
   System.out.println("錯誤訊息:"+e.getMessage());
   e.contactWith();
   verify=false;
  }
  if(verify)
  {
   System.out.println("會員認證驗證失敗！");
  }
  else
  {
   System.out.println("會員認證驗證失敗！");
  }
 }
 public static void checkMemberID(String mID) throws MemberIDExcetpion
 {
 	if(mID.length()!=5)
 	{
 	 throw new MemberIDExcetpion(mID);	
 	}	
 }	
}