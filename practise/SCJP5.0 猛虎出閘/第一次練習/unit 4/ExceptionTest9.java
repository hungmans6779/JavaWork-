class SuperException extends Exception
{
 public SuperException(String mID)
 {
 	//System.out.println("�|���s��: "+mID+" ���O�X�k���ϥΪ̡I");
 	super("�|���s��: "+mID+" ���O�X�k���ϥΪ̡I");
 }		
 static void showError()
 {
 	System.out.println("�бz��t�κ޲z���s��....");
 	System.out.println("�q��09175038xx");
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
 	 System.out.println("��ƿ��~ "+se.getMessage());
 	 se.showError();	
 	 var=false;
 	}	
 	if(var==true)
 	{
 	 System.out.println("�|��������Ҧ��\.............");	
 	}
 	else
 	{
 	 System.out.println("�|��������ҥ���.............");	
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