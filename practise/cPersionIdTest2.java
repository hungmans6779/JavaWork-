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
import java.util.*;
public class cPersionIdTest2
{
 static String id="";
 static int value=0;
 static int okCount=1;
 static boolean showAuto=true;
 public static void main(String argv[])
 {
 	System.out.println("*************身份證產生及驗證系統*************");
 	System.out.println("1.直接輸入一組身份證字號進行驗證");
 	System.out.println("2.自動產生身份證字號");
 	Scanner scan=new Scanner(System.in);
 	System.out.print("請輸入您的選項===>");
 	int select=scan.nextInt();
 	System.out.println("===========================================");
 	switch(select)
 	{
 	 //輸入身份證字號進行驗證	
 	 case 1: 
 	     System.out.print("請輸入您的身份證字號:");
 	     String id=scan.next();
 	     showAuto=false;
 	     checkId(id,1); 
 	  break;
 	 //自動產生身份證字號
 	 case 2:
 	  System.out.print("請輸入您要產生的身份證字號組數===>");
 	  int grNum=scan.nextInt();
    for(okCount=1;okCount<=grNum;okCount++)
    { 
     id=gainId(); //隨機產生身份證字號
     //System.out.println(id);
     checkId(id,okCount);
     id="D1";
    }	 	 
 	  showAuto=true;
 	  break;
 	 default:
 	    break;	
 	}	
 }
 public static String gainId()
 {
 	id="D1";
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
 	//判斷身份證的字號格式是否正確 
 	if(!id.matches("[A-Z][12]\\d\\d\\d\\d\\d\\d\\d\\d"))
 	{
 	 System.out.println("您輸入的身份證字號格式錯誤！！！");	
 	 return;	
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
 	 if(showAuto)	
 	  System.out.println("第"+count+"組產生的身份證字號是:"+id);
 	 else
 	  System.out.println("\n您輸入的身份證字號"+id+"是正確的");
 	}	
 	else
 	{
 	 if(showAuto)	
 	  okCount--;	
    if(!showAuto) 
 	  System.out.println("\n您輸入的身份證字號"+id+"是錯誤的！！！");
 	}	
 }	
}