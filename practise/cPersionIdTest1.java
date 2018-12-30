/* 
 題目：身份證字號編碼方式
 1.共10個字
 2.第一個字母大寫英文字母
 3.第二個字是1或2
 4.第二到十個字為數字
 5.將英文字母以數字代碼取代
 6.將11個數字次別乘以：
   1,9,8,7,6,5,4,3,2,2,並把積加總
 7.若加總值10之倍數，即為正確之身份證字號。
*/
import java.util.Random;
public class cPersionIdTest1
{
 static String id="";
 static int value=0;
 static int okCount=1;
 public static void main(String argv[])
 {
 	id=id.concat("A1");
  for(okCount=1;okCount<=10;okCount++)
  {
   gainId(); //隨機產生身份證字號
   checkId(id,okCount);
   id="D1";
  }	
 }
 public static  String gainId()
 {
  for(int i=1;i<=8;i++)
  {
   Random rv=new Random();
   value=rv.nextInt(10);	
   id=id.concat(String.valueOf(value));	
 	}  	
 	return id;
 }	
 public static  void checkId(String id,int count)
 {
 	//判斷身份證的長度是否正確
 	if(id.length()!=10)
 	{
 	 System.out.println("身份證字號字數錯誤！！！");	
 	 return;
 	}	
 	//判斷身份證的第一個字母是否為英文字母大寫
 	char c;
 	c=id.charAt(0);
 	if(c<'A' || c>'Z')
 	{
 	 System.out.println("身份證第一個字母不是A-Z的值");
 	 return;	
 	}	
 	//判斷第2碼是否為1或2
 	if((!id.substring(1,2).equals("1")) && (!id.substring(1,2).equals("2")))  
 	{
 	 System.out.println("身份證字號的第2碼不為1或2");
 	 return;	
 	}
 	//判斷第3碼後是否為數字
 	for(int i=2;i<=9;i++)
 	{
 	 c=id.charAt(i);
 	 if(c<'0' || c>'9')
 	 {
 	  System.out.println("身份證字號的從第3碼有不為數字的值");	
 	  return;
 	 }		
 	}	
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
 	//System.out.println("total="+total);
 	if(total%10==0)
 	{
 	 System.out.println("第"+count+"組產生的身份證字號是:"+id);
 	}	
 	else
 	{
 	 okCount--;	
 	}	
 }	
}