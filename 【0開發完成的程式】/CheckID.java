public class CheckID
{
	
 private static String message="";
 public static boolean checkID(String id)
 {
 	boolean result=false;
 	id=id.toUpperCase();
 	//判斷身份證的字號格式是否正確
   if(!id.matches("[A-Za-z][12]\\d{8}"))
 	{ 
 		message="身份證格式不是正確的！！！";
 		result=false; 
 	}	
 	else
 	{
    //將第一個英文字母轉換成阿拉伯數字
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
 	   message="身份證字號正確！！！";	
 	   result=true;
 	  } 
 	  else
 	  {
 	   message="身份證字號不合法！！！";
 	   result=false;
 	  } 
 	}
 	return result;	
 }
 
 public static String getMessage()
 { return message; }
 
 
 
 
 
 //此部是測試用的
 public static void main(String argv[])
 {
 	if(checkID("D121208221"))
 	 System.out.println("正確");
 	else
 	 System.out.println("不正確");	
 	 
 	System.out.println(getMessage()); 
 }
 
}