class MemberIDException extends Exception
{
 MemberIDException(String mid)
 {
  super("�|���s��"+mid+"���ҥ���");	
 }	
 public void contactWith()
 {
 	System.out.println("�гs���A�ȤH��+(06)2831xxx");
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
  	System.out.println("���~�T��:"+me.getMessage());
  	me.contactWith();
  	verify=false;
  }		
  if(verify)
   System.out.println("���Ҧ��\...");
  else
   System.out.println("���ҥ���...");
  } 
  public static void checkMember(String id) throws MemberIDException
  {
   if(id.length()!=5)
   {
   	throw new MemberIDException(id);
   }		
  }	
 
}