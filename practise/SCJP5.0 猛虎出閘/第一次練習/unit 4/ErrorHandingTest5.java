class MemberIDExcetpion extends Exception
{
 public MemberIDExcetpion(String mID)
 {
   super("�|���s��"+mID+"���ҥ��ѡI");
 }
 public void contactWith()
 {
  System.out.println("�гs���A�ȤH��:"+"Tel (xx) - (xxxx-xxxx)�I");
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
   System.out.println("���~�T��:"+e.getMessage());
   e.contactWith();
   verify=false;
  }
  if(verify)
  {
   System.out.println("�|���{�����ҥ��ѡI");
  }
  else
  {
   System.out.println("�|���{�����ҥ��ѡI");
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