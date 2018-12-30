public class hTest35
{
 public static void main(String argv[])
 {
 	String str="我是一個SOHO族！一個人在家工作的SOHO族！";
 	String oldStr="SOHO族";
 	String newStr="電腦工作者";
  System.out.println("原本字串是："+str);
 	int find=0;
 	do
 	{
 	 find=str.indexOf(oldStr);
 	 if(find!=-1)
 	 {
 	 	str=str.substring(0,find)+newStr+str.substring(oldStr.length()+find);
 	 }		
 		
 	}while(find!=-1);
 	System.out.println("新的字串是："+str);	
 }		
}	