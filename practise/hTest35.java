public class hTest35
{
 public static void main(String argv[])
 {
 	String str="�ڬO�@��SOHO�ڡI�@�ӤH�b�a�u�@��SOHO�ڡI";
 	String oldStr="SOHO��";
 	String newStr="�q���u�@��";
  System.out.println("�쥻�r��O�G"+str);
 	int find=0;
 	do
 	{
 	 find=str.indexOf(oldStr);
 	 if(find!=-1)
 	 {
 	 	str=str.substring(0,find)+newStr+str.substring(oldStr.length()+find);
 	 }		
 		
 	}while(find!=-1);
 	System.out.println("�s���r��O�G"+str);	
 }		
}	