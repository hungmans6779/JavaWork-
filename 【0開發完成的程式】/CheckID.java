public class CheckID
{
	
 private static String message="";
 public static boolean checkID(String id)
 {
 	boolean result=false;
 	id=id.toUpperCase();
 	//�P�_�����Ҫ��r���榡�O�_���T
   if(!id.matches("[A-Za-z][12]\\d{8}"))
 	{ 
 		message="�����Ү榡���O���T���I�I�I";
 		result=false; 
 	}	
 	else
 	{
    //�N�Ĥ@�ӭ^��r���ഫ�����ԧB�Ʀr
 	  char fId=id.charAt(0);
 	  int buffer=fId-55;
 	  String newId=String.valueOf(buffer)+id.substring(1);
 	  int total=0;
 	  int dd=9;
 	  total=newId.charAt(0)-48;
   	for(int i=1;i<newId.length()-1;i++)
 	  {
 	   total=total+=(newId.charAt(i)-48)*dd;
 	   dd--;
   	} 
 	  total+=(newId.charAt(10))-48;
 	  if(total%10==0)
 	  {
 	   message="�����Ҧr�����T�I�I�I";	
 	   result=true;
 	  } 
 	  else
 	  {
 	   message="�����Ҧr�����X�k�I�I�I";
 	   result=false;
 	  } 
 	}
 	return result;	
 }
 
 public static String getMessage()
 { return message; }
 
 
 
 
 
 //�����O���եΪ�
 public static void main(String argv[])
 {
 	if(checkID("D121208221"))
 	 System.out.println("���T");
 	else
 	 System.out.println("�����T");	
 	 
 	System.out.println(getMessage()); 
 }
 
}